package com.github.macdao.moscow;

import org.junit.Test;

import java.nio.file.Paths;

public class ContractAssertionTest {
    @Test
    public void should_response_foo() throws Exception {
        final ContractContainer contractContainer = new ContractContainer(Paths.get("src/test/resources/contracts"));

        new ContractAssertion(contractContainer.findContracts("should_response_foo"))
                .setPort(12306)
                .assertContract();
    }
}