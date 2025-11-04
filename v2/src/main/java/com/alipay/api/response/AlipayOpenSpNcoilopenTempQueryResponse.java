package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.NcoilopenAddressInfo;
import com.alipay.api.domain.ExtAttributeInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.sp.ncoilopen.temp.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-09-26 11:07:42
 */
public class AlipayOpenSpNcoilopenTempQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6155762569413826456L;

	/** 
	 * 地址信息
	 */
	@ApiField("address_info_map")
	private NcoilopenAddressInfo addressInfoMap;

	/** 
	 * 业务id
	 */
	@ApiField("biz_id")
	private String bizId;

	/** 
	 * 碰一下跳转的页面链接
	 */
	@ApiField("coil_link_url")
	private String coilLinkUrl;

	/** 
	 * 展示在物料上的唯一编号，可为空，若不填，系统将自动分配
	 */
	@ApiField("coil_no")
	private String coilNo;

	/** 
	 * 物料总数，单位：个
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
	 * 二维码链接
	 */
	@ApiField("print_qr_code_url")
	private String printQrCodeUrl;

	/** 
	 * 单条标识id
	 */
	@ApiField("record_id")
	private String recordId;

	public void setAddressInfoMap(NcoilopenAddressInfo addressInfoMap) {
		this.addressInfoMap = addressInfoMap;
	}
	public NcoilopenAddressInfo getAddressInfoMap( ) {
		return this.addressInfoMap;
	}

	public void setBizId(String bizId) {
		this.bizId = bizId;
	}
	public String getBizId( ) {
		return this.bizId;
	}

	public void setCoilLinkUrl(String coilLinkUrl) {
		this.coilLinkUrl = coilLinkUrl;
	}
	public String getCoilLinkUrl( ) {
		return this.coilLinkUrl;
	}

	public void setCoilNo(String coilNo) {
		this.coilNo = coilNo;
	}
	public String getCoilNo( ) {
		return this.coilNo;
	}

	public void setCoilTotal(Long coilTotal) {
		this.coilTotal = coilTotal;
	}
	public Long getCoilTotal( ) {
		return this.coilTotal;
	}

	public void setDeskNo(String deskNo) {
		this.deskNo = deskNo;
	}
	public String getDeskNo( ) {
		return this.deskNo;
	}

	public void setExtAttrList(List<ExtAttributeInfo> extAttrList) {
		this.extAttrList = extAttrList;
	}
	public List<ExtAttributeInfo> getExtAttrList( ) {
		return this.extAttrList;
	}

	public void setGroupNo(String groupNo) {
		this.groupNo = groupNo;
	}
	public String getGroupNo( ) {
		return this.groupNo;
	}

	public void setPrintQrCodeUrl(String printQrCodeUrl) {
		this.printQrCodeUrl = printQrCodeUrl;
	}
	public String getPrintQrCodeUrl( ) {
		return this.printQrCodeUrl;
	}

	public void setRecordId(String recordId) {
		this.recordId = recordId;
	}
	public String getRecordId( ) {
		return this.recordId;
	}

}
