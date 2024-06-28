package vascopanigi.u5_w2_d5.payloads;

import jakarta.validation.constraints.NotEmpty;


public record NewDeviceDTO(@NotEmpty(message = "Device status is mandatory.")
                           String deviceStatus,
                           @NotEmpty(message = "Device Type is mandatory.")
                           String deviceType) {
}
