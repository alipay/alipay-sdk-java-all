package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 单条添加线圈数据
 *
 * @author auto create
 * @since 1.0, 2025-09-26 11:03:42
 */
public class AlipayOpenSpNcoilopenTempAddModel extends AlipayObject {

	private static final long serialVersionUID = 4528926359223642125L;

	/**
	 * 地址信息
	 */
	@ApiField("address_info_map")
	private NcoilopenAddressInfo addressInfoMap;

	/**
	 * 碰一下跳转的页面链接，非二维码链接，是否必填依赖模板配置
	 */
	@ApiField("coil_link_url")
	private String coilLinkUrl;

	/**
	 * 展示在物料上的唯一编号，可为空，若不填，系统将自动分配
	 */
	@ApiField("coil_no")
	private String coilNo;

	/**
	 * 线圈总数
	 */
	@ApiField("coil_total")
	private Long coilTotal;

	/**
	 * 桌号/座号/楼栋号/序号，是否填写依赖模版配置
	 */
	@ApiField("desk_no")
	private String deskNo;

	/**
	 * 扩展属性值，提前和BD确定字段名称，按需填写
	 */
	@ApiListField("ext_attr_list")
	@ApiField("ext_attribute_info")
	private List<ExtAttributeInfo> extAttrList;

	/**
	 * 码组序列：填写后，供应商将同一码组序号的线圈进行分包后发货。支持中文、数字、字母等，若无，可不填
	 */
	@ApiField("group_no")
	private String groupNo;

	/**
	 * 点位名称，是否必填由模板配置决定
	 */
	@ApiField("position_name")
	private String positionName;

	/**
	 * 对外展示的二维码链接，是否必填由模板配置决定
	 */
	@ApiField("print_qr_code_url")
	private String printQrCodeUrl;

	/**
	 * 流水id，通过调用alipay.open.sp.ncoilopen.reference.create接口返回值中获取reference_id
	 */
	@ApiField("reference_id")
	private String referenceId;

	public NcoilopenAddressInfo getAddressInfoMap() {
		return this.addressInfoMap;
	}
	public void setAddressInfoMap(NcoilopenAddressInfo addressInfoMap) {
		this.addressInfoMap = addressInfoMap;
	}

	public String getCoilLinkUrl() {
		return this.coilLinkUrl;
	}
	public void setCoilLinkUrl(String coilLinkUrl) {
		this.coilLinkUrl = coilLinkUrl;
	}

	public String getCoilNo() {
		return this.coilNo;
	}
	public void setCoilNo(String coilNo) {
		this.coilNo = coilNo;
	}

	public Long getCoilTotal() {
		return this.coilTotal;
	}
	public void setCoilTotal(Long coilTotal) {
		this.coilTotal = coilTotal;
	}

	public String getDeskNo() {
		return this.deskNo;
	}
	public void setDeskNo(String deskNo) {
		this.deskNo = deskNo;
	}

	public List<ExtAttributeInfo> getExtAttrList() {
		return this.extAttrList;
	}
	public void setExtAttrList(List<ExtAttributeInfo> extAttrList) {
		this.extAttrList = extAttrList;
	}

	public String getGroupNo() {
		return this.groupNo;
	}
	public void setGroupNo(String groupNo) {
		this.groupNo = groupNo;
	}

	public String getPositionName() {
		return this.positionName;
	}
	public void setPositionName(String positionName) {
		this.positionName = positionName;
	}

	public String getPrintQrCodeUrl() {
		return this.printQrCodeUrl;
	}
	public void setPrintQrCodeUrl(String printQrCodeUrl) {
		this.printQrCodeUrl = printQrCodeUrl;
	}

	public String getReferenceId() {
		return this.referenceId;
	}
	public void setReferenceId(String referenceId) {
		this.referenceId = referenceId;
	}

}
