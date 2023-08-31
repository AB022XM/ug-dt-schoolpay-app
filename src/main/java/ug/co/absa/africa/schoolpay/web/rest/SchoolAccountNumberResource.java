package ug.co.absa.africa.schoolpay.web.rest;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;
import tech.jhipster.web.util.HeaderUtil;
import tech.jhipster.web.util.ResponseUtil;
import ug.co.absa.africa.schoolpay.domain.SchoolAccountNumber;
import ug.co.absa.africa.schoolpay.repository.SchoolAccountNumberRepository;
import ug.co.absa.africa.schoolpay.web.rest.errors.BadRequestAlertException;

/**
 * REST controller for managing {@link ug.co.absa.africa.schoolpay.domain.SchoolAccountNumber}.
 */
@RestController
@RequestMapping("/api")
@Transactional
public class SchoolAccountNumberResource {

    private static final String ENTITY_NAME = "schoolAccountNumber";
    private final Logger log = LoggerFactory.getLogger(SchoolAccountNumberResource.class);
    private final SchoolAccountNumberRepository schoolAccountNumberRepository;

    @Value("${jhipster.clientApp.name}")
    private String applicationName;

    public SchoolAccountNumberResource(SchoolAccountNumberRepository schoolAccountNumberRepository) {
        this.schoolAccountNumberRepository = schoolAccountNumberRepository;
    }

    /**
     * {@code POST  /school-account-numbers} : Create a new schoolAccountNumber.
     *
     * @param schoolAccountNumber the schoolAccountNumber to create.
     * @return the {@link ResponseEntity} with status {@code 201 (Created)} and with body the new schoolAccountNumber, or with status {@code 400 (Bad Request)} if the schoolAccountNumber has already an ID.
     * @throws URISyntaxException if the Location URI syntax is incorrect.
     */
    @PostMapping("/school-account-numbers")
    public ResponseEntity<SchoolAccountNumber> createSchoolAccountNumber(@RequestBody SchoolAccountNumber schoolAccountNumber)
        throws URISyntaxException {
        log.debug("REST request to save SchoolAccountNumber : {}", schoolAccountNumber);
        if (schoolAccountNumber.getId() != null) {
            throw new BadRequestAlertException("A new schoolAccountNumber cannot already have an ID", ENTITY_NAME, "idexists");
        }
        SchoolAccountNumber result = schoolAccountNumberRepository.save(schoolAccountNumber);
        return ResponseEntity
            .created(new URI("/api/school-account-numbers/" + result.getId()))
            .headers(HeaderUtil.createEntityCreationAlert(applicationName, true, ENTITY_NAME, result.getId().toString()))
            .body(result);
    }

    /**
     * {@code PUT  /school-account-numbers/:id} : Updates an existing schoolAccountNumber.
     *
     * @param id                  the id of the schoolAccountNumber to save.
     * @param schoolAccountNumber the schoolAccountNumber to update.
     * @return the {@link ResponseEntity} with status {@code 200 (OK)} and with body the updated schoolAccountNumber,
     * or with status {@code 400 (Bad Request)} if the schoolAccountNumber is not valid,
     * or with status {@code 500 (Internal Server Error)} if the schoolAccountNumber couldn't be updated.
     * @throws URISyntaxException if the Location URI syntax is incorrect.
     */
    @PutMapping("/school-account-numbers/{id}")
    public ResponseEntity<SchoolAccountNumber> updateSchoolAccountNumber(
        @PathVariable(value = "id", required = false) final Long id,
        @RequestBody SchoolAccountNumber schoolAccountNumber
    ) throws URISyntaxException {
        log.debug("REST request to update SchoolAccountNumber : {}, {}", id, schoolAccountNumber);
        if (schoolAccountNumber.getId() == null) {
            throw new BadRequestAlertException("Invalid id", ENTITY_NAME, "idnull");
        }
        if (!Objects.equals(id, schoolAccountNumber.getId())) {
            throw new BadRequestAlertException("Invalid ID", ENTITY_NAME, "idinvalid");
        }

        if (!schoolAccountNumberRepository.existsById(id)) {
            throw new BadRequestAlertException("Entity not found", ENTITY_NAME, "idnotfound");
        }

        SchoolAccountNumber result = schoolAccountNumberRepository.save(schoolAccountNumber);
        return ResponseEntity
            .ok()
            .headers(HeaderUtil.createEntityUpdateAlert(applicationName, true, ENTITY_NAME, schoolAccountNumber.getId().toString()))
            .body(result);
    }

    /**
     * {@code PATCH  /school-account-numbers/:id} : Partial updates given fields of an existing schoolAccountNumber, field will ignore if it is null
     *
     * @param id                  the id of the schoolAccountNumber to save.
     * @param schoolAccountNumber the schoolAccountNumber to update.
     * @return the {@link ResponseEntity} with status {@code 200 (OK)} and with body the updated schoolAccountNumber,
     * or with status {@code 400 (Bad Request)} if the schoolAccountNumber is not valid,
     * or with status {@code 404 (Not Found)} if the schoolAccountNumber is not found,
     * or with status {@code 500 (Internal Server Error)} if the schoolAccountNumber couldn't be updated.
     * @throws URISyntaxException if the Location URI syntax is incorrect.
     */
    @PatchMapping(value = "/school-account-numbers/{id}", consumes = { "application/json", "application/merge-patch+json" })
    public ResponseEntity<SchoolAccountNumber> partialUpdateSchoolAccountNumber(
        @PathVariable(value = "id", required = false) final Long id,
        @RequestBody SchoolAccountNumber schoolAccountNumber
    ) throws URISyntaxException {
        log.debug("REST request to partial update SchoolAccountNumber partially : {}, {}", id, schoolAccountNumber);
        if (schoolAccountNumber.getId() == null) {
            throw new BadRequestAlertException("Invalid id", ENTITY_NAME, "idnull");
        }
        if (!Objects.equals(id, schoolAccountNumber.getId())) {
            throw new BadRequestAlertException("Invalid ID", ENTITY_NAME, "idinvalid");
        }

        if (!schoolAccountNumberRepository.existsById(id)) {
            throw new BadRequestAlertException("Entity not found", ENTITY_NAME, "idnotfound");
        }

        Optional<SchoolAccountNumber> result = schoolAccountNumberRepository
            .findById(schoolAccountNumber.getId())
            .map(existingSchoolAccountNumber -> {
                if (schoolAccountNumber.getAccountId() != null) {
                    existingSchoolAccountNumber.setAccountId(schoolAccountNumber.getAccountId());
                }
                if (schoolAccountNumber.getAccountName() != null) {
                    existingSchoolAccountNumber.setAccountName(schoolAccountNumber.getAccountName());
                }
                if (schoolAccountNumber.getAccountNumber() != null) {
                    existingSchoolAccountNumber.setAccountNumber(schoolAccountNumber.getAccountNumber());
                }
                if (schoolAccountNumber.getSchoolId() != null) {
                    existingSchoolAccountNumber.setSchoolId(schoolAccountNumber.getSchoolId());
                }
                if (schoolAccountNumber.getIsActive() != null) {
                    existingSchoolAccountNumber.setIsActive(schoolAccountNumber.getIsActive());
                }
                if (schoolAccountNumber.getDelflg() != null) {
                    existingSchoolAccountNumber.setDelflg(schoolAccountNumber.getDelflg());
                }

                return existingSchoolAccountNumber;
            })
            .map(schoolAccountNumberRepository::save);

        return ResponseUtil.wrapOrNotFound(
            result,
            HeaderUtil.createEntityUpdateAlert(applicationName, true, ENTITY_NAME, schoolAccountNumber.getId().toString())
        );
    }

    /**
     * {@code GET  /school-account-numbers} : get all the schoolAccountNumbers.
     *
     * @return the {@link ResponseEntity} with status {@code 200 (OK)} and the list of schoolAccountNumbers in body.
     */
    @GetMapping("/school-account-numbers")
    public List<SchoolAccountNumber> getAllSchoolAccountNumbers() {
        log.debug("REST request to get all SchoolAccountNumbers");
        return schoolAccountNumberRepository.findAll();
    }

    /**
     * {@code GET  /school-account-numbers/:id} : get the "id" schoolAccountNumber.
     *
     * @param id the id of the schoolAccountNumber to retrieve.
     * @return the {@link ResponseEntity} with status {@code 200 (OK)} and with body the schoolAccountNumber, or with status {@code 404 (Not Found)}.
     */
    @GetMapping("/school-account-numbers/{id}")
    public ResponseEntity<SchoolAccountNumber> getSchoolAccountNumber(@PathVariable Long id) {
        log.debug("REST request to get SchoolAccountNumber : {}", id);
        Optional<SchoolAccountNumber> schoolAccountNumber = schoolAccountNumberRepository.findById(id);
        return ResponseUtil.wrapOrNotFound(schoolAccountNumber);
    }

    /**
     * {@code DELETE  /school-account-numbers/:id} : delete the "id" schoolAccountNumber.
     *
     * @param id the id of the schoolAccountNumber to delete.
     * @return the {@link ResponseEntity} with status {@code 204 (NO_CONTENT)}.
     */
    @DeleteMapping("/school-account-numbers/{id}")
    public ResponseEntity<Void> deleteSchoolAccountNumber(@PathVariable Long id) {
        log.debug("REST request to delete SchoolAccountNumber : {}", id);
        schoolAccountNumberRepository.deleteById(id);
        return ResponseEntity
            .noContent()
            .headers(HeaderUtil.createEntityDeletionAlert(applicationName, true, ENTITY_NAME, id.toString()))
            .build();
    }
}
