package work.tangthinker.microserviceconsumermovie.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

/**
 * @author shanliao420@yeah.net
 * @date 2023/5/10 19:56 星期三
 * @file User
 * @project SpringCloud
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {

    private Long id;

    private String username;

    private String name;

    private Integer age;

    private BigDecimal balance;

}
