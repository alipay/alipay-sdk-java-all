package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 外部机构名单导入
 *
 * @author auto create
 * @since 1.0, 2022-04-28 11:10:40
 */
public class MybankCreditLoanapplyUserlistUploadModel extends AlipayObject {

	private static final long serialVersionUID = 3382496827561359481L;

	/**
	 * 数据类型
	 */
	@ApiField("category")
	private String category;

	/**
	 * 外部机构编码(ISV注册成为网商银行的会员，ISV在网商的会员ID)
	 */
	@ApiField("dataorgid")
	private String dataorgid;

	/**
	 * 数据提供者,ISV注册成为网商银行的会员，达成数据合作服务，约定数据模型，由网商分配给ISV的机构代号
	 */
	@ApiField("dataprovider")
	private String dataprovider;

	/**
	 * 数据加密类型
	 */
	@ApiField("encryption_type")
	private String encryptionType;

	/**
	 * 名单详细列表
	 */
	@ApiListField("list_info")
	@ApiField("list_detail")
	private List<ListDetail> listInfo;

	public String getCategory() {
		return this.category;
	}
	public void setCategory(String category) {
		this.category = category;
	}

	public String getDataorgid() {
		return this.dataorgid;
	}
	public void setDataorgid(String dataorgid) {
		this.dataorgid = dataorgid;
	}

	public String getDataprovider() {
		return this.dataprovider;
	}
	public void setDataprovider(String dataprovider) {
		this.dataprovider = dataprovider;
	}

	public String getEncryptionType() {
		return this.encryptionType;
	}
	public void setEncryptionType(String encryptionType) {
		this.encryptionType = encryptionType;
	}

	public List<ListDetail> getListInfo() {
		return this.listInfo;
	}
	public void setListInfo(List<ListDetail> listInfo) {
		this.listInfo = listInfo;
	}

}
