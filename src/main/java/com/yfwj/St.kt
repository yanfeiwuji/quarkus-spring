package com.yfwj

import org.springframework.data.repository.PagingAndSortingRepository
import javax.persistence.Entity
import javax.persistence.Id

/**
 * @author  yanfeiwuji
 * @date  2021/6/27 9:48 下午
 */
@Entity
class Person {
    @Id
    lateinit var id: String
    lateinit var name: String
}

interface PersonRepo : PagingAndSortingRepository<Person, String>