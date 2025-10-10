package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.DiscountVO;
import com.alipay.api.domain.ItemsVO;
import com.alipay.api.domain.MedicareInfoVO;
import com.alipay.api.domain.OrderInfoVO;
import com.alipay.api.domain.PaymentVO;
import com.alipay.api.domain.PrescriptionVO;
import com.alipay.api.domain.StoreVO;
import com.alipay.api.domain.UserSimpleVO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.medical.order.detail.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-09-16 11:57:39
 */
public class AlipayCommerceMedicalOrderDetailQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4447951657666897312L;

	/** 
	 * 用户订单维度享受的优惠信息
	 */
	@ApiListField("discount")
	@ApiField("discount_v_o")
	private List<DiscountVO> discount;

	/** 
	 * 商品信息
	 */
	@ApiListField("items")
	@ApiField("items_v_o")
	private List<ItemsVO> items;

	/** 
	 * 医保报销信息
	 */
	@ApiField("medicare")
	private MedicareInfoVO medicare;

	/** 
	 * 订单信息
	 */
	@ApiField("order")
	private OrderInfoVO order;

	/** 
	 * 支付信息
	 */
	@ApiField("payment")
	private PaymentVO payment;

	/** 
	 * 处方信息
	 */
	@ApiListField("prescriptions")
	@ApiField("prescription_v_o")
	private List<PrescriptionVO> prescriptions;

	/** 
	 * 商户店铺信息
	 */
	@ApiField("store")
	private StoreVO store;

	/** 
	 * 收货人信息
	 */
	@ApiField("user")
	private UserSimpleVO user;

	public void setDiscount(List<DiscountVO> discount) {
		this.discount = discount;
	}
	public List<DiscountVO> getDiscount( ) {
		return this.discount;
	}

	public void setItems(List<ItemsVO> items) {
		this.items = items;
	}
	public List<ItemsVO> getItems( ) {
		return this.items;
	}

	public void setMedicare(MedicareInfoVO medicare) {
		this.medicare = medicare;
	}
	public MedicareInfoVO getMedicare( ) {
		return this.medicare;
	}

	public void setOrder(OrderInfoVO order) {
		this.order = order;
	}
	public OrderInfoVO getOrder( ) {
		return this.order;
	}

	public void setPayment(PaymentVO payment) {
		this.payment = payment;
	}
	public PaymentVO getPayment( ) {
		return this.payment;
	}

	public void setPrescriptions(List<PrescriptionVO> prescriptions) {
		this.prescriptions = prescriptions;
	}
	public List<PrescriptionVO> getPrescriptions( ) {
		return this.prescriptions;
	}

	public void setStore(StoreVO store) {
		this.store = store;
	}
	public StoreVO getStore( ) {
		return this.store;
	}

	public void setUser(UserSimpleVO user) {
		this.user = user;
	}
	public UserSimpleVO getUser( ) {
		return this.user;
	}

}
