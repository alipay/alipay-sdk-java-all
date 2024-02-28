package com.alipay.api.domain;

import java.util.Date;
import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 卡券信息
 *
 * @author auto create
 * @since 1.0, 2017-11-30 10:29:10
 */
public class PassInfoOpenApiModel extends AlipayObject {

	private static final long serialVersionUID = 8858197335617239498L;

	/**
	 * 凭证信息
	 */
	@ApiField("data_info")
	private String dataInfo;

	/**
	 * 有效期结束时间
	 */
	@ApiField("end_date")
	private Date endDate;

	/**
	 * 扩展信息
	 */
	@ApiField("ext_info")
	private String extInfo;

	/**
	 * 券创建时间
	 */
	@ApiField("gmt_create")
	private Date gmtCreate;

	/**
	 * 商品id
	 */
	@ApiField("item_id")
	private String itemId;

	/**
	 * 卡券第一行文字
	 */
	@ApiField("logo_text")
	private String logoText;

	/**
	 * 商家名称
	 */
	@ApiField("mechant_name")
	private String mechantName;

	/**
	 * 券ID
	 */
	@ApiField("pass_id")
	private String passId;

	/**
	 * 卡券第二行文字
	 */
	@ApiField("second_logo_text")
	private String secondLogoText;

	/**
	 * 可用门店信息
	 */
	@ApiListField("shop_id_list")
	@ApiField("string")
	private List<String> shopIdList;

	/**
	 * 有效期开始时间
	 */
	@ApiField("start_date")
	private Date startDate;

	/**
	 * 券状态,"can_use", "可使用";"used", "已使用";"expired", "已过期";"closed", "已失效"
	 */
	@ApiField("status")
	private String status;

	public String getDataInfo() {
		return this.dataInfo;
	}
	public void setDataInfo(String dataInfo) {
		this.dataInfo = dataInfo;
	}

	public Date getEndDate() {
		return this.endDate;
	}
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public String getExtInfo() {
		return this.extInfo;
	}
	public void setExtInfo(String extInfo) {
		this.extInfo = extInfo;
	}

	public Date getGmtCreate() {
		return this.gmtCreate;
	}
	public void setGmtCreate(Date gmtCreate) {
		this.gmtCreate = gmtCreate;
	}

	public String getItemId() {
		return this.itemId;
	}
	public void setItemId(String itemId) {
		this.itemId = itemId;
	}

	public String getLogoText() {
		return this.logoText;
	}
	public void setLogoText(String logoText) {
		this.logoText = logoText;
	}

	public String getMechantName() {
		return this.mechantName;
	}
	public void setMechantName(String mechantName) {
		this.mechantName = mechantName;
	}

	public String getPassId() {
		return this.passId;
	}
	public void setPassId(String passId) {
		this.passId = passId;
	}

	public String getSecondLogoText() {
		return this.secondLogoText;
	}
	public void setSecondLogoText(String secondLogoText) {
		this.secondLogoText = secondLogoText;
	}

	public List<String> getShopIdList() {
		return this.shopIdList;
	}
	public void setShopIdList(List<String> shopIdList) {
		this.shopIdList = shopIdList;
	}

	public Date getStartDate() {
		return this.startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

}
