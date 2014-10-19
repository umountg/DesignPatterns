package lv.nikolay.designpatterns.creationaldesignpatterns.databuilder.account;


public class AccountMyBuilder {
    private String name = "N/A";
    private String id = "N/A";
    private AccountStatus status;
    private Company company;

    public static AccountMyBuilder anAccount() {
        return new AccountMyBuilder();
    }

    public AccountMyBuilder withName(String name) {
        this.name = name;
        return this;
    }

    public AccountMyBuilder withId(String id) {
        this.id = id;
        return this;
    }

    public AccountMyBuilder withStatus(AccountStatus status) {
        this.status = status;
        return this;
    }

    public AccountMyBuilder withCompany(Company company) {
        this.company = company;
        return this;
    }

    public Account build() {
        Account account = new Account();
        account.setName(name);
        account.setId(id);
        account.setStatus(status);
        account.setCompany(company);
        return account;
    }


}

