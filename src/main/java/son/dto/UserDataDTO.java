package son.dto;

import java.util.List;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import son.model.Role;

@NoArgsConstructor
@Getter
@Setter
@ApiModel(description = "Info of user")
public class UserDataDTO {
  
  @ApiModelProperty(position = 0, notes = "Username of this DTO")
  private String username;
  @ApiModelProperty(position = 1)
  private String email;
  @ApiModelProperty(position = 2)
  private String password;
  @ApiModelProperty(position = 3)
  List<Role> roles;

}
