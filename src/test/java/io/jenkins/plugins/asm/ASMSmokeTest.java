package io.jenkins.plugins.asm;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.InputStream;
import org.junit.jupiter.api.Test;
import org.objectweb.asm.ClassReader;

public class ASMSmokeTest {

    @Test
    public void smokeTest() throws Exception {
        InputStream in = ASMSmokeTest.class.getResourceAsStream("ASMSmokeTest.class");
        byte[] b = in.readAllBytes();
        assertDoesNotThrow(() -> {
            ClassReader cr = new ClassReader(b);
            assertEquals("io/jenkins/plugins/asm/ASMSmokeTest", cr.getClassName());
        });
    }
}
