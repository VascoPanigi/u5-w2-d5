package vascopanigi.u5_w2_d5.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import vascopanigi.u5_w2_d5.entities.Device;

import java.util.UUID;

public interface DeviceRepository extends JpaRepository<Device, UUID> {
}
