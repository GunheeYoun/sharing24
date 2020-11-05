package sharingclothes;

public class Ordered extends AbstractEvent {

    private Long id;
    private Long clothsId;
    private Integer qty;

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