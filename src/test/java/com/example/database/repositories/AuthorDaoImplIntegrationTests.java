//package com.example.database.repositories;
//
//import com.example.database.TestDataUtil;
//import com.example.database.dao.impl.AuthorDaoImpl;
//import com.example.database.domain.Author;
//import org.junit.jupiter.api.Test;
//import org.junit.jupiter.api.extension.ExtendWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.test.annotation.DirtiesContext;
//import org.springframework.test.context.junit.jupiter.SpringExtension;
//import static  org.assertj.core.api.Assertions.assertThat;
//
//import java.util.List;
//import java.util.Optional;
//
//@SpringBootTest
//@ExtendWith(SpringExtension.class)
//@DirtiesContext(classMode = DirtiesContext.ClassMode.AFTER_EACH_TEST_METHOD)
//public class AuthorDaoImplIntegrationTests {
//
//    private AuthorDaoImpl underTest;
//
//    @Autowired
//    public AuthorDaoImplIntegrationTests(AuthorDaoImpl underTest){
//        this.underTest = underTest;
//    }
//    @Test
//    public void TestThatAuthorIsCreated(){
//
//        Author author = TestDataUtil.createTestAuthor1();
//        underTest.create(author);
//        Optional<Author> result = underTest.findOne(author.getId());
//        assertThat(result).isPresent();
//        assertThat(result.get()).isEqualTo(author);
//
//    }
//
//    @Test
//    public void TestThatAuthorIsFetchedAfterCreation(){
//        Author author1 = TestDataUtil.createTestAuthor1();
//        underTest.create(author1);
//        Author author2 = TestDataUtil.createTestAuthor2();
//        underTest.create(author2);
//        Author author3 = TestDataUtil.createTestAuthor3();
//        underTest.create(author3);
//
//        List<Author> results = underTest.findMany();
//        assertThat(results).hasSize(3).
//                            containsExactly(author1,author2,author3);
//
//    }
//
//    @Test
//    public void TestThatAuthorIsUpdated(){
//        Author author1 = TestDataUtil.createTestAuthor1();
//        underTest.create(author1);
//        author1.setName("Updated");
//        underTest.update(author1,author1.getId() );
//        Optional<Author> result = underTest.findOne(author1.getId());
//
//        assertThat(result).isPresent();
//        assertThat(result.get()).isEqualTo(author1);
//    }
//    @Test
//    public void TestThatAuthorIsDeleted(){
//        Author author1 = TestDataUtil.createTestAuthor1();
//        underTest.create(author1);
//        underTest.delete(author1.getId());
//        Optional<Author> result = underTest.findOne(author1.getId());
//        assertThat(result).isEmpty();
//    }
//
//
//
//}
