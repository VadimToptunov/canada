package com.find.job.in.repository;

import com.find.job.in.entity.LmiaData;
import org.springframework.data.cassandra.repository.CassandraRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LmiaRepository extends CassandraRepository<LmiaData, Long> {
}
