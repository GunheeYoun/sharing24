package sharingclothes;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="Mypage_table")
public class Mypage {

        @Id
        @GeneratedValue(strategy=GenerationType.AUTO)
        private Long id;
        private Long oerderId;
        private Long clothsId;
        private Integer qty;
        private Long deliveryId;
        private String status;


        public Long getId() {
            return id;
        }

        public void setId(Long id) {
            this.id = id;
        }
        public Long getOerderId() {
            return oerderId;
        }

        public void setOerderId(Long oerderId) {
            this.oerderId = oerderId;
        }
        public Long getClothsId() {
            return clothsId;
        }

        public void setClothsId(Long clothsId) {
            this.clothsId = clothsId;
        }
        public Integer getQty() {
            return qty;
        }

        public void setQty(Integer qty) {
            this.qty = qty;
        }
        public Long getDeliveryId() {
            return deliveryId;
        }

        public void setDeliveryId(Long deliveryId) {
            this.deliveryId = deliveryId;
        }
        public String getStatus() {
            return status;
        }

        public void setStatus(String status) {
            this.status = status;
        }

}
