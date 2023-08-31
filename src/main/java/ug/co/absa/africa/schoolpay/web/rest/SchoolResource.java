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
import ug.co.absa.africa.schoolpay.domain.School;
import ug.co.absa.africa.schoolpay.repository.SchoolRepository;
import ug.co.absa.africa.schoolpay.web.rest.errors.BadRequestAlertException;

/**
 * REST controller for managing {@link ug.co.absa.africa.schoolpay.domain.School}.
 */
@RestController
@RequestMapping("/api")
@Transactional
public class SchoolResource {

    private static final String ENTITY_NAME = "school";
    private final Logger log = LoggerFactory.getLogger(SchoolResource.class);
    private final SchoolRepository schoolRepository;

    @Value("${jhipster.clientApp.name}")
    private String applicationName;

    public SchoolResource(SchoolRepository schoolRepository) {
        this.schoolRepository = schoolRepository;
    }

    /**
     * {@code POST  /schools} : Create a new school.
     *
     * @param school the school to create.
     * @return the {@link ResponseEntity} with status {@code 201 (Created)} and with body the new school, or with status {@code 400 (Bad Request)} if the school has already an ID.
     * @throws URISyntaxException if the Location URI syntax is incorrect.
     */
    @PostMapping("/schools")
    public ResponseEntity<School> createSchool(@RequestBody School school) throws URISyntaxException {
        log.debug("REST request to save School : {}", school);
        if (school.getId() != null) {
            throw new BadRequestAlertException("A new school cannot already have an ID", ENTITY_NAME, "idexists");
        }
        School result = schoolRepository.save(school);
        return ResponseEntity
            .created(new URI("/api/schools/" + result.getId()))
            .headers(HeaderUtil.createEntityCreationAlert(applicationName, true, ENTITY_NAME, result.getId().toString()))
            .body(result);
    }

    /**
     * {@code PUT  /schools/:id} : Updates an existing school.
     *
     * @param id     the id of the school to save.
     * @param school the school to update.
     * @return the {@link ResponseEntity} with status {@code 200 (OK)} and with body the updated school,
     * or with status {@code 400 (Bad Request)} if the school is not valid,
     * or with status {@code 500 (Internal Server Error)} if the school couldn't be updated.
     * @throws URISyntaxException if the Location URI syntax is incorrect.
     */
    @PutMapping("/schools/{id}")
    public ResponseEntity<School> updateSchool(@PathVariable(value = "id", required = false) final Long id, @RequestBody School school)
        throws URISyntaxException {
        log.debug("REST request to update School : {}, {}", id, school);
        if (school.getId() == null) {
            throw new BadRequestAlertException("Invalid id", ENTITY_NAME, "idnull");
        }
        if (!Objects.equals(id, school.getId())) {
            throw new BadRequestAlertException("Invalid ID", ENTITY_NAME, "idinvalid");
        }

        if (!schoolRepository.existsById(id)) {
            throw new BadRequestAlertException("Entity not found", ENTITY_NAME, "idnotfound");
        }

        School result = schoolRepository.save(school);
        return ResponseEntity
            .ok()
            .headers(HeaderUtil.createEntityUpdateAlert(applicationName, true, ENTITY_NAME, school.getId().toString()))
            .body(result);
    }

    /**
     * {@code PATCH  /schools/:id} : Partial updates given fields of an existing school, field will ignore if it is null
     *
     * @param id     the id of the school to save.
     * @param school the school to update.
     * @return the {@link ResponseEntity} with status {@code 200 (OK)} and with body the updated school,
     * or with status {@code 400 (Bad Request)} if the school is not valid,
     * or with status {@code 404 (Not Found)} if the school is not found,
     * or with status {@code 500 (Internal Server Error)} if the school couldn't be updated.
     * @throws URISyntaxException if the Location URI syntax is incorrect.
     */
    @PatchMapping(value = "/schools/{id}", consumes = { "application/json", "application/merge-patch+json" })
    public ResponseEntity<School> partialUpdateSchool(
        @PathVariable(value = "id", required = false) final Long id,
        @RequestBody School school
    ) throws URISyntaxException {
        log.debug("REST request to partial update School partially : {}, {}", id, school);
        if (school.getId() == null) {
            throw new BadRequestAlertException("Invalid id", ENTITY_NAME, "idnull");
        }
        if (!Objects.equals(id, school.getId())) {
            throw new BadRequestAlertException("Invalid ID", ENTITY_NAME, "idinvalid");
        }

        if (!schoolRepository.existsById(id)) {
            throw new BadRequestAlertException("Entity not found", ENTITY_NAME, "idnotfound");
        }

        Optional<School> result = schoolRepository
            .findById(school.getId())
            .map(existingSchool -> {
                if (school.getSchoolId() != null) {
                    existingSchool.setSchoolId(school.getSchoolId());
                }
                if (school.getSchoolCode() != null) {
                    existingSchool.setSchoolCode(school.getSchoolCode());
                }
                if (school.getSchoolName() != null) {
                    existingSchool.setSchoolName(school.getSchoolName());
                }
                if (school.getSchoolTransactionIdentifier() != null) {
                    existingSchool.setSchoolTransactionIdentifier(school.getSchoolTransactionIdentifier());
                }
                if (school.getSchoolBankIdentifier() != null) {
                    existingSchool.setSchoolBankIdentifier(school.getSchoolBankIdentifier());
                }
                if (school.getSchoolAddress1() != null) {
                    existingSchool.setSchoolAddress1(school.getSchoolAddress1());
                }
                if (school.getSchoolAddress2() != null) {
                    existingSchool.setSchoolAddress2(school.getSchoolAddress2());
                }
                if (school.getSchoolAddress3() != null) {
                    existingSchool.setSchoolAddress3(school.getSchoolAddress3());
                }
                if (school.getSchoolAddress4() != null) {
                    existingSchool.setSchoolAddress4(school.getSchoolAddress4());
                }
                if (school.getSchoolAddress5() != null) {
                    existingSchool.setSchoolAddress5(school.getSchoolAddress5());
                }
                if (school.getSchoolAddress6() != null) {
                    existingSchool.setSchoolAddress6(school.getSchoolAddress6());
                }
                if (school.getSchoolAddress7() != null) {
                    existingSchool.setSchoolAddress7(school.getSchoolAddress7());
                }
                if (school.getSchoolContact1() != null) {
                    existingSchool.setSchoolContact1(school.getSchoolContact1());
                }
                if (school.getSchoolContact2() != null) {
                    existingSchool.setSchoolContact2(school.getSchoolContact2());
                }
                if (school.getSchoolContact3() != null) {
                    existingSchool.setSchoolContact3(school.getSchoolContact3());
                }
                if (school.getSchoolContact4() != null) {
                    existingSchool.setSchoolContact4(school.getSchoolContact4());
                }
                if (school.getSchoolContact5() != null) {
                    existingSchool.setSchoolContact5(school.getSchoolContact5());
                }
                if (school.getSchoolContact6() != null) {
                    existingSchool.setSchoolContact6(school.getSchoolContact6());
                }
                if (school.getSchoolContact7() != null) {
                    existingSchool.setSchoolContact7(school.getSchoolContact7());
                }
                if (school.getSchoolAccountId() != null) {
                    existingSchool.setSchoolAccountId(school.getSchoolAccountId());
                }
                if (school.getSchoolImage() != null) {
                    existingSchool.setSchoolImage(school.getSchoolImage());
                }
                if (school.getSchoolImageContentType() != null) {
                    existingSchool.setSchoolImageContentType(school.getSchoolImageContentType());
                }
                if (school.getSchoolIcon() != null) {
                    existingSchool.setSchoolIcon(school.getSchoolIcon());
                }
                if (school.getSchoolIconContentType() != null) {
                    existingSchool.setSchoolIconContentType(school.getSchoolIconContentType());
                }
                if (school.getIsActive() != null) {
                    existingSchool.setIsActive(school.getIsActive());
                }
                if (school.getDelflg() != null) {
                    existingSchool.setDelflg(school.getDelflg());
                }
                if (school.getSchoolPrimaryColor() != null) {
                    existingSchool.setSchoolPrimaryColor(school.getSchoolPrimaryColor());
                }
                if (school.getSchoolSecondaryColor() != null) {
                    existingSchool.setSchoolSecondaryColor(school.getSchoolSecondaryColor());
                }
                if (school.getIsAllowedToTransact() != null) {
                    existingSchool.setIsAllowedToTransact(school.getIsAllowedToTransact());
                }

                return existingSchool;
            })
            .map(schoolRepository::save);

        return ResponseUtil.wrapOrNotFound(
            result,
            HeaderUtil.createEntityUpdateAlert(applicationName, true, ENTITY_NAME, school.getId().toString())
        );
    }

    /**
     * {@code GET  /schools} : get all the schools.
     *
     * @return the {@link ResponseEntity} with status {@code 200 (OK)} and the list of schools in body.
     */
    @GetMapping("/schools")
    public List<School> getAllSchools() {
        log.debug("REST request to get all Schools");
        return schoolRepository.findAll();
    }

    /**
     * {@code GET  /schools/:id} : get the "id" school.
     *
     * @param id the id of the school to retrieve.
     * @return the {@link ResponseEntity} with status {@code 200 (OK)} and with body the school, or with status {@code 404 (Not Found)}.
     */
    @GetMapping("/schools/{id}")
    public ResponseEntity<School> getSchool(@PathVariable Long id) {
        log.debug("REST request to get School : {}", id);
        Optional<School> school = schoolRepository.findById(id);
        return ResponseUtil.wrapOrNotFound(school);
    }

    /**
     * {@code DELETE  /schools/:id} : delete the "id" school.
     *
     * @param id the id of the school to delete.
     * @return the {@link ResponseEntity} with status {@code 204 (NO_CONTENT)}.
     */
    @DeleteMapping("/schools/{id}")
    public ResponseEntity<Void> deleteSchool(@PathVariable Long id) {
        log.debug("REST request to delete School : {}", id);
        schoolRepository.deleteById(id);
        return ResponseEntity
            .noContent()
            .headers(HeaderUtil.createEntityDeletionAlert(applicationName, true, ENTITY_NAME, id.toString()))
            .build();
    }
}
