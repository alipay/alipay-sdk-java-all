package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 履约检查检验数据
 *
 * @author auto create
 * @since 1.0, 2026-04-10 16:25:12
 */
public class Examination extends AlipayObject {

	private static final long serialVersionUID = 1539551746258774699L;

	/**
	 * 应用id
	 */
	@ApiField("application_id")
	private String applicationId;

	/**
	 * 预约信息
	 */
	@ApiField("book_info")
	private ExaminationBookInfo bookInfo;

	/**
	 * 检测信息
	 */
	@ApiField("check_info")
	private ExaminationCheckInfo checkInfo;

	/**
	 * 收货信息
	 */
	@ApiField("deliver_info")
	private ExaminationDeliverInfo deliverInfo;

	/**
	 * 履约状态，非枚举。
	 */
	@ApiField("fulfillment_status")
	private String fulfillmentStatus;

	/**
	 * 商品信息列表
	 */
	@ApiListField("items")
	@ApiField("examination_item_v_o")
	private List<ExaminationItemVO> items;

	/**
	 * SAAS的订单号
	 */
	@ApiField("order_no")
	private String orderNo;

	/**
	 * 支付信息
	 */
	@ApiField("pay_info")
	private ExaminationPayInfo payInfo;

	/**
	 * 外部履约单号
	 */
	@ApiField("relation_order_no")
	private String relationOrderNo;

	/**
	 * 商家ID
	 */
	@ApiField("seller_code")
	private String sellerCode;

	/**
	 * 来源
	 */
	@ApiField("source")
	private String source;

	/**
	 * 门店编码
	 */
	@ApiField("store_code")
	private String storeCode;

	/**
	 * 门店id
	 */
	@ApiField("store_id")
	private String storeId;

	/**
	 * 门店名称
	 */
	@ApiField("store_name")
	private String storeName;

	/**
	 * 履约单编号
	 */
	@ApiField("unique_no")
	private String uniqueNo;

	public String getApplicationId() {
		return this.applicationId;
	}
	public void setApplicationId(String applicationId) {
		this.applicationId = applicationId;
	}

	public ExaminationBookInfo getBookInfo() {
		return this.bookInfo;
	}
	public void setBookInfo(ExaminationBookInfo bookInfo) {
		this.bookInfo = bookInfo;
	}

	public ExaminationCheckInfo getCheckInfo() {
		return this.checkInfo;
	}
	public void setCheckInfo(ExaminationCheckInfo checkInfo) {
		this.checkInfo = checkInfo;
	}

	public ExaminationDeliverInfo getDeliverInfo() {
		return this.deliverInfo;
	}
	public void setDeliverInfo(ExaminationDeliverInfo deliverInfo) {
		this.deliverInfo = deliverInfo;
	}

	public String getFulfillmentStatus() {
		return this.fulfillmentStatus;
	}
	public void setFulfillmentStatus(String fulfillmentStatus) {
		this.fulfillmentStatus = fulfillmentStatus;
	}

	public List<ExaminationItemVO> getItems() {
		return this.items;
	}
	public void setItems(List<ExaminationItemVO> items) {
		this.items = items;
	}

	public String getOrderNo() {
		return this.orderNo;
	}
	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}

	public ExaminationPayInfo getPayInfo() {
		return this.payInfo;
	}
	public void setPayInfo(ExaminationPayInfo payInfo) {
		this.payInfo = payInfo;
	}

	public String getRelationOrderNo() {
		return this.relationOrderNo;
	}
	public void setRelationOrderNo(String relationOrderNo) {
		this.relationOrderNo = relationOrderNo;
	}

	public String getSellerCode() {
		return this.sellerCode;
	}
	public void setSellerCode(String sellerCode) {
		this.sellerCode = sellerCode;
	}

	public String getSource() {
		return this.source;
	}
	public void setSource(String source) {
		this.source = source;
	}

	public String getStoreCode() {
		return this.storeCode;
	}
	public void setStoreCode(String storeCode) {
		this.storeCode = storeCode;
	}

	public String getStoreId() {
		return this.storeId;
	}
	public void setStoreId(String storeId) {
		this.storeId = storeId;
	}

	public String getStoreName() {
		return this.storeName;
	}
	public void setStoreName(String storeName) {
		this.storeName = storeName;
	}

	public String getUniqueNo() {
		return this.uniqueNo;
	}
	public void setUniqueNo(String uniqueNo) {
		this.uniqueNo = uniqueNo;
	}

}
