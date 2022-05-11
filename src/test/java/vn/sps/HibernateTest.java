package vn.sps;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import vn.sps.entity.Book;
import vn.sps.service.BookService;

import java.util.ArrayList;
import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class HibernateTest {

    private SessionFactory sessionFactory;

    @Mock
    private BookService bookService;

    @Mock
    private Session session;

    @Before
    public void init() {
        Mockito.when(sessionFactory.openSession()).thenReturn(session);
    }

    @Test
    public void test() {
        List<Book> mockedResult = new ArrayList<>();
        mockedResult.add(new Book("Test", "Robin", 10));
        Mockito.when(session.createQuery("from Book", Book.class).list()).thenReturn(mockedResult);
        Assert.assertEquals(mockedResult.size(), this.bookService.getBooks().size());
    }
}
