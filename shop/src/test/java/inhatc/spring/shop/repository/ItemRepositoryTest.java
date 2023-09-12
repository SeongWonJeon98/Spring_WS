package inhatc.spring.shop.repository;

import inhatc.spring.shop.constant.ItemSellStatus;
import inhatc.spring.shop.entity.Item;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@Transactional
class ItemRepositoryTest {

    @Autowired
    private ItemRepository itemRepository;
    
    @Test
    @DisplayName("상품 저장 테스트")
    public void createItemTest(){
        Item item  = Item.builder()
                .itemNm("테스트 상품")
                .price(10000)
                .itemDetail("테스트 상품 상세 설명")
                .itemSellStatus(ItemSellStatus.SELL)
                .stockNumber(100)
                .regTime(LocalDateTime.now())
                .updateTime(LocalDateTime.now())
                .build();
        System.out.println("Item : " + item);
        Item saveItem = itemRepository.save(item);
        System.out.println("saveItem : " + saveItem);
    }
}