package com.alipay.api.response;

import java.util.Date;
import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.iot.dapply.orderdetail.query response.
 * 
 * @author auto create
 * @since 1.0, 2026-07-03 15:32:57
 */
public class AlipayCommerceIotDapplyOrderdetailQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4433421327875526717L;

	/** 
	 * 下单时传入的收货详细地址
	 */
	@ApiField("address")
	private String address;

	/** 
	 * 下单时传入的申请人手机号脱敏信息
	 */
	@ApiField("applicant_mobile")
	private String applicantMobile;

	/** 
	 * 申请人脱敏信息
	 */
	@ApiField("applicant_name")
	private String applicantName;

	/** 
	 * 供应链系统订单号，又称AO单，当审核通过提交供应链后生成相应单号
	 */
	@ApiField("asset_apply_order_id")
	private String assetApplyOrderId;

	/** 
	 * 批次下单生成的批次号
	 */
	@ApiField("batch_no")
	private String batchNo;

	/** 
	 * 下单时传入的城市对应的城市编码
	 */
	@ApiField("city_code")
	private String cityCode;

	/** 
	 * 下单时传入的城市
	 */
	@ApiField("city_name")
	private String cityName;

	/** 
	 * 下单时传入的区对应的编码
	 */
	@ApiField("district_code")
	private String districtCode;

	/** 
	 * 下单时传入的区
	 */
	@ApiField("district_name")
	private String districtName;

	/** 
	 * 订单创建时间
	 */
	@ApiField("gmt_create")
	private Date gmtCreate;

	/** 
	 * 下单时传入的备注信息
	 */
	@ApiField("memo")
	private String memo;

	/** 
	 * 设备申请业务订单号（唯一键）
	 */
	@ApiField("order_biz_id")
	private String orderBizId;

	/** 
	 * 设备申请单状态枚举值
	 */
	@ApiField("order_status")
	private String orderStatus;

	/** 
	 * 省编码
	 */
	@ApiField("province_code")
	private String provinceCode;

	/** 
	 * 下单时传入的收货人信息
	 */
	@ApiField("province_name")
	private String provinceName;

	/** 
	 * 下单时传入的收货人手机号
	 */
	@ApiField("receiver_mobile")
	private String receiverMobile;

	/** 
	 * 批次下单时传入的收货人姓名脱敏信息
	 */
	@ApiField("receiver_name")
	private String receiverName;

	/** 
	 * 下单时用户传入的门店名称
	 */
	@ApiField("shop_name")
	private String shopName;

	/** 
	 * 订单状态对应的中文描述
	 */
	@ApiField("status")
	private String status;

	public void setAddress(String address) {
		this.address = address;
	}
	public String getAddress( ) {
		return this.address;
	}

	public void setApplicantMobile(String applicantMobile) {
		this.applicantMobile = applicantMobile;
	}
	public String getApplicantMobile( ) {
		return this.applicantMobile;
	}

	public void setApplicantName(String applicantName) {
		this.applicantName = applicantName;
	}
	public String getApplicantName( ) {
		return this.applicantName;
	}

	public void setAssetApplyOrderId(String assetApplyOrderId) {
		this.assetApplyOrderId = assetApplyOrderId;
	}
	public String getAssetApplyOrderId( ) {
		return this.assetApplyOrderId;
	}

	public void setBatchNo(String batchNo) {
		this.batchNo = batchNo;
	}
	public String getBatchNo( ) {
		return this.batchNo;
	}

	public void setCityCode(String cityCode) {
		this.cityCode = cityCode;
	}
	public String getCityCode( ) {
		return this.cityCode;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}
	public String getCityName( ) {
		return this.cityName;
	}

	public void setDistrictCode(String districtCode) {
		this.districtCode = districtCode;
	}
	public String getDistrictCode( ) {
		return this.districtCode;
	}

	public void setDistrictName(String districtName) {
		this.districtName = districtName;
	}
	public String getDistrictName( ) {
		return this.districtName;
	}

	public void setGmtCreate(Date gmtCreate) {
		this.gmtCreate = gmtCreate;
	}
	public Date getGmtCreate( ) {
		return this.gmtCreate;
	}

	public void setMemo(String memo) {
		this.memo = memo;
	}
	public String getMemo( ) {
		return this.memo;
	}

	public void setOrderBizId(String orderBizId) {
		this.orderBizId = orderBizId;
	}
	public String getOrderBizId( ) {
		return this.orderBizId;
	}

	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}
	public String getOrderStatus( ) {
		return this.orderStatus;
	}

	public void setProvinceCode(String provinceCode) {
		this.provinceCode = provinceCode;
	}
	public String getProvinceCode( ) {
		return this.provinceCode;
	}

	public void setProvinceName(String provinceName) {
		this.provinceName = provinceName;
	}
	public String getProvinceName( ) {
		return this.provinceName;
	}

	public void setReceiverMobile(String receiverMobile) {
		this.receiverMobile = receiverMobile;
	}
	public String getReceiverMobile( ) {
		return this.receiverMobile;
	}

	public void setReceiverName(String receiverName) {
		this.receiverName = receiverName;
	}
	public String getReceiverName( ) {
		return this.receiverName;
	}

	public void setShopName(String shopName) {
		this.shopName = shopName;
	}
	public String getShopName( ) {
		return this.shopName;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	public String getStatus( ) {
		return this.status;
	}

}
