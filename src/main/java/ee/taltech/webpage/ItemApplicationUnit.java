package ee.taltech.webpage;

import ee.taltech.webpage.items.Item;
import ee.taltech.webpage.repository.ItemsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ItemApplicationUnit implements CommandLineRunner {

    @Autowired
    private ItemsRepository itemsRepository;

    @Override
    public void run(String... args) throws Exception {
        List<Item> items = List.of(
                new Item( (long) 1, "Oden's", "/assets/images/odens.png", 5.60, "Snus", 4.0, 5),
                new Item( (long) 2, "Thunder", "/assets/images/thunder.png", 7.20, "Snus", 4.2, 4),
                new Item( (long) 3, "Siberia", "/assets/images/siberia.png", 4.80, "Snus", 3.8, 5),
                new Item( (long) 4, "KNOX", "/assets/images/knox.png", 6.00, "Snus", 4.6, 3),
                new Item( (long) 5, "Skruf", "/assets/images/skruf.png", 4.99, "Snus", 3.7, 4)
        );

        itemsRepository.saveAll(items);
    }

}
