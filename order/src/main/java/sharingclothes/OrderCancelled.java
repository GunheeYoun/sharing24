package sharingclothes;

public class OrderCancelled extends AbstractEvent {

    private Long id;
    private Long clothsId;
    private Integer qty;

    public OrderCancelled(){
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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
}
