package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 服务商作业数据回传
 *
 * @author auto create
 * @since 1.0, 2024-03-07 10:56:18
 */
public class AlipayOpenSpIsvOperationSyncModel extends AlipayObject {

	private static final long serialVersionUID = 6116764266523177255L;

	/**
	 * 客户类型，PERSONAL表示个人，ALIPAY_RECOMMEND表示支付宝推荐
	 */
	@ApiField("customer_type")
	private String customerType;

	/**
	 * 拓展字段回传
	 */
	@ApiField("ext_info")
	private OperationResultExtInfo extInfo;

	/**
	 * 实施结束时间
	 */
	@ApiField("implement_end_time")
	private String implementEndTime;

	/**
	 * 实施对象名称
	 */
	@ApiField("implement_object_name")
	private String implementObjectName;

	/**
	 * 实施地点
	 */
	@ApiField("implement_place")
	private String implementPlace;

	/**
	 * 实施结果，SUCCESS表示实施成功，FAIL表示实施失败
	 */
	@ApiField("implement_result")
	private String implementResult;

	/**
	 * 实施结果的照片
	 */
	@ApiField("implement_result_image")
	private String implementResultImage;

	/**
	 * 实施结果的备注
	 */
	@ApiField("implement_result_remark")
	private String implementResultRemark;

	/**
	 * 实施开始时间
	 */
	@ApiField("implement_start_time")
	private String implementStartTime;

	/**
	 * 服务优选商品编码
	 */
	@ApiField("item_code")
	private String itemCode;

	/**
	 * 商品价格，这里填写的是整数，单位为分，比如1元，那么输入100
	 */
	@ApiField("item_price")
	private String itemPrice;

	/**
	 * 商户pid
	 */
	@ApiField("merchant_pid")
	private String merchantPid;

	/**
	 * 商品小程序appid，若推广的商品不为小程序，则不传此参数
	 */
	@ApiField("mini_appid")
	private String miniAppid;

	/**
	 * 拓展助手中的商机id
	 */
	@ApiField("oppor_id")
	private String opporId;

	/**
	 * 下单订单号
	 */
	@ApiField("order_id")
	private String orderId;

	/**
	 * 外部业务号，传isv系统生成的账单号，需要保证唯一
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 推广服务商(S2)pid
	 */
	@ApiField("promotor_pid")
	private String promotorPid;

	/**
	 * 店铺id
	 */
	@ApiField("shop_id")
	private String shopId;

	/**
	 * 推广服务商(S2)子账号pid
	 */
	@ApiField("sub_promotor_pid")
	private String subPromotorPid;

	public String getCustomerType() {
		return this.customerType;
	}
	public void setCustomerType(String customerType) {
		this.customerType = customerType;
	}

	public OperationResultExtInfo getExtInfo() {
		return this.extInfo;
	}
	public void setExtInfo(OperationResultExtInfo extInfo) {
		this.extInfo = extInfo;
	}

	public String getImplementEndTime() {
		return this.implementEndTime;
	}
	public void setImplementEndTime(String implementEndTime) {
		this.implementEndTime = implementEndTime;
	}

	public String getImplementObjectName() {
		return this.implementObjectName;
	}
	public void setImplementObjectName(String implementObjectName) {
		this.implementObjectName = implementObjectName;
	}

	public String getImplementPlace() {
		return this.implementPlace;
	}
	public void setImplementPlace(String implementPlace) {
		this.implementPlace = implementPlace;
	}

	public String getImplementResult() {
		return this.implementResult;
	}
	public void setImplementResult(String implementResult) {
		this.implementResult = implementResult;
	}

	public String getImplementResultImage() {
		return this.implementResultImage;
	}
	public void setImplementResultImage(String implementResultImage) {
		this.implementResultImage = implementResultImage;
	}

	public String getImplementResultRemark() {
		return this.implementResultRemark;
	}
	public void setImplementResultRemark(String implementResultRemark) {
		this.implementResultRemark = implementResultRemark;
	}

	public String getImplementStartTime() {
		return this.implementStartTime;
	}
	public void setImplementStartTime(String implementStartTime) {
		this.implementStartTime = implementStartTime;
	}

	public String getItemCode() {
		return this.itemCode;
	}
	public void setItemCode(String itemCode) {
		this.itemCode = itemCode;
	}

	public String getItemPrice() {
		return this.itemPrice;
	}
	public void setItemPrice(String itemPrice) {
		this.itemPrice = itemPrice;
	}

	public String getMerchantPid() {
		return this.merchantPid;
	}
	public void setMerchantPid(String merchantPid) {
		this.merchantPid = merchantPid;
	}

	public String getMiniAppid() {
		return this.miniAppid;
	}
	public void setMiniAppid(String miniAppid) {
		this.miniAppid = miniAppid;
	}

	public String getOpporId() {
		return this.opporId;
	}
	public void setOpporId(String opporId) {
		this.opporId = opporId;
	}

	public String getOrderId() {
		return this.orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

	public String getPromotorPid() {
		return this.promotorPid;
	}
	public void setPromotorPid(String promotorPid) {
		this.promotorPid = promotorPid;
	}

	public String getShopId() {
		return this.shopId;
	}
	public void setShopId(String shopId) {
		this.shopId = shopId;
	}

	public String getSubPromotorPid() {
		return this.subPromotorPid;
	}
	public void setSubPromotorPid(String subPromotorPid) {
		this.subPromotorPid = subPromotorPid;
	}

}
