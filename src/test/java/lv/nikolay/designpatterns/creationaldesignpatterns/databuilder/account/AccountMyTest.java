package lv.nikolay.designpatterns.creationaldesignpatterns.databuilder.account;

import junit.framework.TestCase;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import static lv.nikolay.designpatterns.creationaldesignpatterns.databuilder.account.AccountMyBuilder.anAccount;

public class AccountMyTest {

    @Mock
    private Company company;

    @Mock
    private AccountStatus accountStatus;

    public void setUp() throws Exception {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testAccountMyBuilder() {
        Account acc = new AccountMyBuilder().withId("ultra").withName("Nikolay").withStatus(accountStatus).withCompany(company).build();
        TestCase.assertEquals("ultra", acc.getId());
        TestCase.assertEquals("Nikolay", acc.getName());
        TestCase.assertSame(accountStatus, acc.getStatus());
        TestCase.assertSame(company, acc.getCompany());
    }

    @Test
    public void testMyBuilderDefaults() {
        Account acc = new AccountMyBuilder().withStatus(accountStatus).build();
        TestCase.assertEquals("N/A", acc.getId());
        TestCase.assertEquals("N/A", acc.getName());
        TestCase.assertSame(accountStatus, acc.getStatus());
        TestCase.assertNull(acc.getCompany());
    }

    @Test
    public void testAccountMyBuilderWONew() {
        Account acc = anAccount().withId("ultra").withName("Nikolay").withStatus(accountStatus).withCompany(company).build();
        TestCase.assertEquals("ultra", acc.getId());
        TestCase.assertEquals("Nikolay", acc.getName());
        TestCase.assertSame(accountStatus, acc.getStatus());
        TestCase.assertSame(company, acc.getCompany());
    }

}
