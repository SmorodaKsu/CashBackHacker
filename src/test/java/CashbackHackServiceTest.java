import org.junit.jupiter.api.Assertions;
import org.testng.Assert;
import org.testng.annotations.Test;
import ru.netology.service.CashbackHackService;

public class CashbackHackServiceTest {

    private final CashbackHackService service = new CashbackHackService();

    @Test
    public void testRemain() {
        Assertions Assert;
        Assert.assertEquals(service.remain(900), 100);
        Assert.assertEquals(service.remain(1000), 0);
        Assert.assertEquals(service.remain(1500), 500);
    }
}

import org.junit.Assert;
import org.junit.Test;
import ru.netology.service.CashbackHackService;

public class CashbackHackServiceTest {

    private final CashbackHackService service = new CashbackHackService();

    @Test
    public void testRemain() {
        Assert.assertEquals(100, service.remain(900));
        Assert.assertEquals(0, service.remain(1000));
        Assert.assertEquals(500, service.remain(1500));
    }
}
