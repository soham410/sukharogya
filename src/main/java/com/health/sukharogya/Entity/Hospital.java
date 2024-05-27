package com.health.sukharogya.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;
import org.hibernate.envers.AuditTable;
import org.hibernate.envers.Audited;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@Entity
@Table(name = "hospital")
@Data
@Audited
@AuditTable(value = "hospital_history")
public class Hospital extends BaseEntity{

    String name;
    String code;

}
