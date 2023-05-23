package com.alipay.api.domain;

import java.util.Date;
import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 开放平台券交易详情
 *
 * @author auto create
 * @since 1.0, 2022-12-08 16:57:31
 */
public class OpenVoucherTradeFundDetail extends AlipayObject {

	private static final long serialVersionUID = 6323185982423329999L;

	/**
	 * 金额，单位分
	 */
	@ApiField("amount")
	private Long amount;

	/**
	 * 资产编码
	 */
	@ApiField("assets_code")
	private String assetsCode;

	/**
	 * 业务上下文
	 */
	@ApiField("biz_context")
	private String bizContext;

	/**
	 * 上层业务事件码
	 */
	@ApiField("biz_ev_code")
	private String bizEvCode;

	/**
	 * 上层业务产品码
	 */
	@ApiField("biz_pd_code")
	private String bizPdCode;

	/**
	 * 业务类型
	 */
	@ApiField("biz_type")
	private String bizType;

	/**
	 * 现金价值，单位分
	 */
	@ApiField("cash")
	private Long cash;

	/**
	 * 端到端事件码
	 */
	@ApiField("cnl_ev_code")
	private String cnlEvCode;

	/**
	 * 端到端流水号
	 */
	@ApiField("cnl_no")
	private String cnlNo;

	/**
	 * 端到端产品码
	 */
	@ApiField("cnl_pd_code")
	private String cnlPdCode;

	/**
	 * 交易详情Id
	 */
	@ApiField("detail_id")
	private String detailId;

	/**
	 * 详细标签
	 */
	@ApiField("detail_tag")
	private String detailTag;

	/**
	 * 本层事件码
	 */
	@ApiField("ev_code")
	private String evCode;

	/**
	 * 扩展信息
	 */
	@ApiField("extend_info")
	private String extendInfo;

	/**
	 * 资金成分流水信息
	 */
	@ApiListField("fund_component_detail_list")
	@ApiField("open_fund_component_detail_d_t_o")
	private List<OpenFundComponentDetailDTO> fundComponentDetailList;

	/**
	 * 资金信息
	 */
	@ApiListField("fund_infos")
	@ApiField("open_fund_info")
	private List<OpenFundInfo> fundInfos;

	/**
	 * 创建时间
	 */
	@ApiField("gmt_create")
	private Date gmtCreate;

	/**
	 * 修改时间
	 */
	@ApiField("gmt_modified")
	private Date gmtModified;

	/**
	 * 商品列表:单品券返回
	 */
	@ApiListField("item_ids")
	@ApiField("string")
	private List<String> itemIds;

	/**
	 * 券名称
	 */
	@ApiField("name")
	private String name;

	/**
	 * 订单号
	 */
	@ApiField("order_id")
	private String orderId;

	/**
	 * 本层产品码
	 */
	@ApiField("pd_code")
	private String pdCode;

	/**
	 * 产品编码
	 */
	@ApiField("product_code")
	private String productCode;

	/**
	 * 订单状态，初始状态:I 成功状态:S
	 */
	@ApiField("status")
	private String status;

	/**
	 * 券模板Id
	 */
	@ApiField("template_id")
	private String templateId;

	/**
	 * 交易号
	 */
	@ApiField("trade_no")
	private String tradeNo;

	/**
	 * 用户Id
	 */
	@ApiField("user_id")
	private String userId;

	/**
	 * 券描述
	 */
	@ApiField("voucher_description")
	private String voucherDescription;

	/**
	 * 券Id
	 */
	@ApiField("voucher_id")
	private String voucherId;

	public Long getAmount() {
		return this.amount;
	}
	public void setAmount(Long amount) {
		this.amount = amount;
	}

	public String getAssetsCode() {
		return this.assetsCode;
	}
	public void setAssetsCode(String assetsCode) {
		this.assetsCode = assetsCode;
	}

	public String getBizContext() {
		return this.bizContext;
	}
	public void setBizContext(String bizContext) {
		this.bizContext = bizContext;
	}

	public String getBizEvCode() {
		return this.bizEvCode;
	}
	public void setBizEvCode(String bizEvCode) {
		this.bizEvCode = bizEvCode;
	}

	public String getBizPdCode() {
		return this.bizPdCode;
	}
	public void setBizPdCode(String bizPdCode) {
		this.bizPdCode = bizPdCode;
	}

	public String getBizType() {
		return this.bizType;
	}
	public void setBizType(String bizType) {
		this.bizType = bizType;
	}

	public Long getCash() {
		return this.cash;
	}
	public void setCash(Long cash) {
		this.cash = cash;
	}

	public String getCnlEvCode() {
		return this.cnlEvCode;
	}
	public void setCnlEvCode(String cnlEvCode) {
		this.cnlEvCode = cnlEvCode;
	}

	public String getCnlNo() {
		return this.cnlNo;
	}
	public void setCnlNo(String cnlNo) {
		this.cnlNo = cnlNo;
	}

	public String getCnlPdCode() {
		return this.cnlPdCode;
	}
	public void setCnlPdCode(String cnlPdCode) {
		this.cnlPdCode = cnlPdCode;
	}

	public String getDetailId() {
		return this.detailId;
	}
	public void setDetailId(String detailId) {
		this.detailId = detailId;
	}

	public String getDetailTag() {
		return this.detailTag;
	}
	public void setDetailTag(String detailTag) {
		this.detailTag = detailTag;
	}

	public String getEvCode() {
		return this.evCode;
	}
	public void setEvCode(String evCode) {
		this.evCode = evCode;
	}

	public String getExtendInfo() {
		return this.extendInfo;
	}
	public void setExtendInfo(String extendInfo) {
		this.extendInfo = extendInfo;
	}

	public List<OpenFundComponentDetailDTO> getFundComponentDetailList() {
		return this.fundComponentDetailList;
	}
	public void setFundComponentDetailList(List<OpenFundComponentDetailDTO> fundComponentDetailList) {
		this.fundComponentDetailList = fundComponentDetailList;
	}

	public List<OpenFundInfo> getFundInfos() {
		return this.fundInfos;
	}
	public void setFundInfos(List<OpenFundInfo> fundInfos) {
		this.fundInfos = fundInfos;
	}

	public Date getGmtCreate() {
		return this.gmtCreate;
	}
	public void setGmtCreate(Date gmtCreate) {
		this.gmtCreate = gmtCreate;
	}

	public Date getGmtModified() {
		return this.gmtModified;
	}
	public void setGmtModified(Date gmtModified) {
		this.gmtModified = gmtModified;
	}

	public List<String> getItemIds() {
		return this.itemIds;
	}
	public void setItemIds(List<String> itemIds) {
		this.itemIds = itemIds;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getOrderId() {
		return this.orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public String getPdCode() {
		return this.pdCode;
	}
	public void setPdCode(String pdCode) {
		this.pdCode = pdCode;
	}

	public String getProductCode() {
		return this.productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	public String getTemplateId() {
		return this.templateId;
	}
	public void setTemplateId(String templateId) {
		this.templateId = templateId;
	}

	public String getTradeNo() {
		return this.tradeNo;
	}
	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getVoucherDescription() {
		return this.voucherDescription;
	}
	public void setVoucherDescription(String voucherDescription) {
		this.voucherDescription = voucherDescription;
	}

	public String getVoucherId() {
		return this.voucherId;
	}
	public void setVoucherId(String voucherId) {
		this.voucherId = voucherId;
	}

}
