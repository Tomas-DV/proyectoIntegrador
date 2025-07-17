import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class ClienteTest {
    
     @Test
    public void testConstructorYGetters() {
        // Datos de prueba
        String nombre = "Juan";
        String apellido = "Pérez";
        String dni = "12345678";
        int id = 101;
        String email = "juan@example.com";
        String password = "1234";

        // Crear objeto
        Cliente cliente = new Cliente(nombre, apellido, dni, id, email, password);

        // Verificar atributos heredados
        assertEquals(nombre, cliente.getNombre());
        assertEquals(apellido, cliente.getApellido());
        assertEquals(dni, cliente.getDni());

        // Verificar atributos propios
        assertEquals(id, cliente.getId());
        assertEquals(email, cliente.getEmail());
        assertEquals(password, cliente.getPassword());
    }

    @Test
    public void testConstructorVacio() {
        Cliente cliente = new Cliente();
        assertNotNull(cliente);
    }
}
