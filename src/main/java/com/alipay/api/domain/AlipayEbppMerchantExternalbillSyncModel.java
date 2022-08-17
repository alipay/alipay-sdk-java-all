package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 动账同步
 *
 * @author auto create
 * @since 1.0, 2021-11-09 14:29:20
 */
public class AlipayEbppMerchantExternalbillSyncModel extends AlipayObject {

	private static final long serialVersionUID = 7169525643986464765L;

	/**
	 * yyyyMMdd+0(DB_FLAG)+0070(SYSTEM_FLAG)+018(SUB_BIZ_FLAG,新建)+0000(预留)+DB_SPLIT(BIZ_TYPE+SUB_BIZTYPE+MERCHANT_CODE, 2位)+TABLE_FLAG(MERCHANT_CODE, 2位)+8位全局唯一nextValue
	 */
	@ApiField("alipay_bill_id")
	private String alipayBillId;

	/**
	 * 账期金额,单位元
	 */
	@ApiField("bill_amount")
	private String billAmount;

	/**
	 * 账期描述
	 */
	@ApiField("bill_date_desc")
	private String billDateDesc;

	/**
	 * 账期结束时间
	 */
	@ApiField("bill_date_end")
	private Date billDateEnd;

	/**
	 * 账期起始时间
	 */
	@ApiField("bill_date_start")
	private Date billDateStart;

	/**
	 * 账单过期时间, 可为空, 默认2099年
	 */
	@ApiField("expiry_date")
	private Date expiryDate;

	/**
	 * PROPERTY_MNG/物业费，
PROPERTY_WATER/代收水费，
PROPERTY_ELECTRIC/代收电费，
PROPERTY_SHARE/公共维护金，
PROPERTY_PARK_MNG/车位管理费，
PROPERTY_PARK_LEASE /车位租赁费，
PROPERTY_ROOM_LEASE/房屋租赁费，
PROPERTY_TEMP_PARK/临时停车费，
PROPERTY_PUBLIC_ENERGY/公共能耗费，
PROPERTY_GAS/代收燃气费，
PROPERTY_MAINTENANCE/维修服务费，
PROPERTY_HOUSEKEEPING/家政服务费，
PROPERTY_GREENING/绿化服务费，
PROPERTY_STORAGE_ROOM/储藏室物业费，
PROPERTY_DECORATION_DEPOSIT/装修押金，
PROPERTY_REFUSE_COLLECTION/垃圾清运费，
PROPERTY_PAID_SERVICE/有偿服务费，
PROPERTY_WATER_SHARING/水费公摊费，
PROPERTY_ELECTRIC_SHARING/电费公摊费,
PROPERTY_DECORATION_MANAGEMENT/装修管理费,
PROPERTY_HEATING_FEE/代收取暖费。
	 */
	@ApiField("fee_type")
	private String feeType;

	/**
	 * 滞纳金, 单位元
	 */
	@ApiField("fine_amount")
	private String fineAmount;

	/**
	 * 滞纳金产生时间, 空代表不会出现滞纳金
	 */
	@ApiField("fine_date")
	private Date fineDate;

	/**
	 * 外部业务号
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 账单生效时间
	 */
	@ApiField("release_date")
	private Date releaseDate;

	/**
	 * 该账单是否用户可选 ，1 可选 0不可选，默认不可选
	 */
	@ApiField("select_optional")
	private String selectOptional;

	/**
	 * 账单排列顺序，大于0时生效
	 */
	@ApiField("sequence")
	private Long sequence;

	/**
	 * 服务费, 单位元
	 */
	@ApiField("service_amount")
	private String serviceAmount;

	/**
	 * 动账来源
	 */
	@ApiField("source")
	private String source;

	/**
	 * FINISH_PAY/REFUND/INVALID
	 */
	@ApiField("status")
	private String status;

	/**
	 * 账单总金额,单位 元
	 */
	@ApiField("total_amount")
	private String totalAmount;

	public String getAlipayBillId() {
		return this.alipayBillId;
	}
	public void setAlipayBillId(String alipayBillId) {
		this.alipayBillId = alipayBillId;
	}

	public String getBillAmount() {
		return this.billAmount;
	}
	public void setBillAmount(String billAmount) {
		this.billAmount = billAmount;
	}

	public String getBillDateDesc() {
		return this.billDateDesc;
	}
	public void setBillDateDesc(String billDateDesc) {
		this.billDateDesc = billDateDesc;
	}

	public Date getBillDateEnd() {
		return this.billDateEnd;
	}
	public void setBillDateEnd(Date billDateEnd) {
		this.billDateEnd = billDateEnd;
	}

	public Date getBillDateStart() {
		return this.billDateStart;
	}
	public void setBillDateStart(Date billDateStart) {
		this.billDateStart = billDateStart;
	}

	public Date getExpiryDate() {
		return this.expiryDate;
	}
	public void setExpiryDate(Date expiryDate) {
		this.expiryDate = expiryDate;
	}

	public String getFeeType() {
		return this.feeType;
	}
	public void setFeeType(String feeType) {
		this.feeType = feeType;
	}

	public String getFineAmount() {
		return this.fineAmount;
	}
	public void setFineAmount(String fineAmount) {
		this.fineAmount = fineAmount;
	}

	public Date getFineDate() {
		return this.fineDate;
	}
	public void setFineDate(Date fineDate) {
		this.fineDate = fineDate;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

	public Date getReleaseDate() {
		return this.releaseDate;
	}
	public void setReleaseDate(Date releaseDate) {
		this.releaseDate = releaseDate;
	}

	public String getSelectOptional() {
		return this.selectOptional;
	}
	public void setSelectOptional(String selectOptional) {
		this.selectOptional = selectOptional;
	}

	public Long getSequence() {
		return this.sequence;
	}
	public void setSequence(Long sequence) {
		this.sequence = sequence;
	}

	public String getServiceAmount() {
		return this.serviceAmount;
	}
	public void setServiceAmount(String serviceAmount) {
		this.serviceAmount = serviceAmount;
	}

	public String getSource() {
		return this.source;
	}
	public void setSource(String source) {
		this.source = source;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	public String getTotalAmount() {
		return this.totalAmount;
	}
	public void setTotalAmount(String totalAmount) {
		this.totalAmount = totalAmount;
	}

}
