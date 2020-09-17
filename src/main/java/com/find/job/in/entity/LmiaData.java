package com.find.job.in.entity;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.cassandra.core.cql.Ordering;
import org.springframework.data.cassandra.core.cql.PrimaryKeyType;
import org.springframework.data.cassandra.core.mapping.Column;
import org.springframework.data.cassandra.core.mapping.PrimaryKeyColumn;
import org.springframework.data.cassandra.core.mapping.Table;

@Table("lmiadata")
public class LmiaData {
    @PrimaryKeyColumn(
            name = "id",
            ordinal = 2,
            type = PrimaryKeyType.PARTITIONED,
            ordering = Ordering.DESCENDING
    )

    @Getter
    @Setter
    public Long id;

    @Column
    @Getter
    @Setter
    public String territory;

    @Column
    @Getter
    @Setter
    public String employer;

    @Column
    @Getter
    @Setter
    public String address;

    @Column
    @Getter
    @Setter
    public String noc;

    @Column
    @Getter
    @Setter
    private Long positionsApproved;
}
