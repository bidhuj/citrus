package com.consol.citrus.actions;

import org.springframework.jdbc.core.support.JdbcDaoSupport;

import com.consol.citrus.TestAction;
import com.consol.citrus.context.TestContext;
import com.consol.citrus.exceptions.CitrusRuntimeException;

public abstract class AbstractDatabaseConnectingTestAction extends JdbcDaoSupport implements TestAction {
    private String description;

    /** TestAction name injected as spring bean name */
    private String name = this.getClass().getSimpleName();

    /**
     * @throws CitrusRuntimeException
     */
    public abstract void execute(TestContext context);

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * (non-Javadoc)
     * @see com.consol.citrus.TestAction#setName(java.lang.String)
     */
    public void setName(String name) {
        this.name = name;
    }
}
