package dev.com.Java10x.CadastroDeNinjas.Missoes;

import dev.com.Java10x.CadastroDeNinjas.Ninjas.NinjaModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table (name = "tb_missoes")
@Data // Cria todos os GETTERS E SETTERS
@NoArgsConstructor // Cria um construtor vazio
@AllArgsConstructor // Cria um construtor com todos os atributos
public class MissoesModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    private String name;

    private String dificuldade;

    //OneToMany - Uma missao pode ter muitos ninjas - Uma para muitos
    @OneToMany(mappedBy = "missoes") // MappedBy - Relacionar com a coluna la em NinjasModel
    private List<NinjaModel> ninjas;
}
