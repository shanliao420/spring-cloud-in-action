package work.tangthinker.microserviceuserservice.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

/**
 * @author shanliao420@yeah.net
 * @date 2023/5/10 19:06 星期三
 * @file User
 * @project SpringCloud
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "tb_user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column
    private String username;

    @Column
    private String name;

    @Column
    private Integer age;

    @Column
    private BigDecimal balance;


}
