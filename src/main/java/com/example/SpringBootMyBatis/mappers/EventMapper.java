package com.example.SpringBootMyBatis.mappers;

import com.example.SpringBootMyBatis.domain.Event;
import org.apache.ibatis.annotations.Mapper;
import java.util.List;

/**
 *  This MyBatis PostgreSQL Mapper interface, this class will be used to call all action related to DB.
 */

@Mapper
public interface EventMapper {

    public List<Event> findAll();
    public void insert(Event event);

}
