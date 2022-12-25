package com.alipay.api.domain;

import java.util.Date;
import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 二方机构根标签据查询有效券信息
 *
 * @author auto create
 * @since 1.0, 2022-12-05 20:36:28
 */
public class AlipayMarketingVoucherBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 6822327266271539881L;

	/**
	 * 券业务编码
	 */
	@ApiListField("biz_codes")
	@ApiField("string")
	private List<String> bizCodes;

	/**
	 * 创建结束时间
	 */
	@ApiField("create_end_time")
	private Date createEndTime;

	/**
	 * 创建券的开始时间
	 */
	@ApiField("create_start_time")
	private Date createStartTime;

	/**
	 * 冻结码列表
	 */
	@ApiListField("freeze_codes")
	@ApiField("string")
	private List<String> freezeCodes;

	/**
	 * 当前页数
	 */
	@ApiField("page_num")
	private String pageNum;

	/**
	 * 每页显示条数
	 */
	@ApiField("page_size")
	private String pageSize;

	/**
	 * 券产品码列表
	 */
	@ApiListField("product_codes")
	@ApiField("string")
	private List<String> productCodes;

	/**
	 * ENABLED查询可用券
	 */
	@ApiListField("status_list")
	@ApiField("string")
	private List<String> statusList;

	/**
	 * key:value,如果根据tag标签查询，则传{"tag":["hz_tongyong"]}
	 */
	@ApiField("template_extend_info")
	private String templateExtendInfo;

	/**
	 * 指定模板列表查询，只查询这些模板下面的券
	 */
	@ApiListField("template_ids")
	@ApiField("string")
	private List<String> templateIds;

	/**
	 * 唯一信息（用于透传用户信息）
	 */
	@ApiField("user_info")
	private VcpUniqueInfo userInfo;

	/**
	 * key:value,如果根据tag标签查询，则传{"tag":["hz_tongyong"]}
	 */
	@ApiField("voucher_extend_info")
	private String voucherExtendInfo;

	public List<String> getBizCodes() {
		return this.bizCodes;
	}
	public void setBizCodes(List<String> bizCodes) {
		this.bizCodes = bizCodes;
	}

	public Date getCreateEndTime() {
		return this.createEndTime;
	}
	public void setCreateEndTime(Date createEndTime) {
		this.createEndTime = createEndTime;
	}

	public Date getCreateStartTime() {
		return this.createStartTime;
	}
	public void setCreateStartTime(Date createStartTime) {
		this.createStartTime = createStartTime;
	}

	public List<String> getFreezeCodes() {
		return this.freezeCodes;
	}
	public void setFreezeCodes(List<String> freezeCodes) {
		this.freezeCodes = freezeCodes;
	}

	public String getPageNum() {
		return this.pageNum;
	}
	public void setPageNum(String pageNum) {
		this.pageNum = pageNum;
	}

	public String getPageSize() {
		return this.pageSize;
	}
	public void setPageSize(String pageSize) {
		this.pageSize = pageSize;
	}

	public List<String> getProductCodes() {
		return this.productCodes;
	}
	public void setProductCodes(List<String> productCodes) {
		this.productCodes = productCodes;
	}

	public List<String> getStatusList() {
		return this.statusList;
	}
	public void setStatusList(List<String> statusList) {
		this.statusList = statusList;
	}

	public String getTemplateExtendInfo() {
		return this.templateExtendInfo;
	}
	public void setTemplateExtendInfo(String templateExtendInfo) {
		this.templateExtendInfo = templateExtendInfo;
	}

	public List<String> getTemplateIds() {
		return this.templateIds;
	}
	public void setTemplateIds(List<String> templateIds) {
		this.templateIds = templateIds;
	}

	public VcpUniqueInfo getUserInfo() {
		return this.userInfo;
	}
	public void setUserInfo(VcpUniqueInfo userInfo) {
		this.userInfo = userInfo;
	}

	public String getVoucherExtendInfo() {
		return this.voucherExtendInfo;
	}
	public void setVoucherExtendInfo(String voucherExtendInfo) {
		this.voucherExtendInfo = voucherExtendInfo;
	}

}
