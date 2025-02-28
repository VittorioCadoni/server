package repositories;

import entities.Ordine;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface OrdineRepo extends JpaRepository<Ordine, Long> {

    // Puoi aggiungere query personalizzate qui, se necessario

    // Esempio: trova gli ordini di un utente specifico
    List<Ordine> findByUtenteId(Long utenteId);

    // Esempio: trova un ordine per prodotto
    Optional<Ordine> findByProdotto(String prodotto);

    // Esempio: trova ordini per data
    List<Ordine> findByDataBetween(Date startDate, Date endDate);
}
