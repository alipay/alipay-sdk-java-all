package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 内容检索服务接口
 *
 * @author auto create
 * @since 1.0, 2019-11-15 15:04:39
 */
public class AlipayDataIotdataSearchlibraryBaiQueryModel extends AlipayObject {

	private static final long serialVersionUID = 3511868584438157344L;

	/**
	 * 账户ID，账户粒度ID。
	 */
	@ApiField("account_id")
	private String accountId;

	/**
	 * 产品id
	 */
	@ApiField("biz_id")
	private String bizId;

	/**
	 * 商户ID，即平台用户ID
	 */
	@ApiField("company_id")
	private String companyId;

	/**
	 * 内容ID
	 */
	@ApiField("content_id")
	private String contentId;

	/**
	 * 待检测内容的raw data，这期暂不使用
	 */
	@ApiField("entity_data")
	private String entityData;

	/**
	 * 待检测字段的描述信息，包括标题、描述或关键词，json格式字符串
	 */
	@ApiField("entity_desc")
	private String entityDesc;

	/**
	 * 内容hash值
	 */
	@ApiField("entity_hash")
	private String entityHash;

	/**
	 * 待检测内容类型，[TEXT, PICTURE, VIDEO, HTML]
	 */
	@ApiField("entity_type")
	private String entityType;

	/**
	 * 待检测内容oss url（后续可以扩展为非oss的文件url）
	 */
	@ApiField("entity_url")
	private String entityUrl;

	/**
	 * 媒体内容向量化的结果。
	 */
	@ApiField("entity_vector")
	private String entityVector;

	/**
	 * 扩展字段1
	 */
	@ApiField("ex_1")
	private String ex1;

	/**
	 * 扩展字段2
	 */
	@ApiField("ex_2")
	private String ex2;

	/**
	 * 扩展字段3
	 */
	@ApiField("ex_3")
	private String ex3;

	/**
	 * 扩展字段4
	 */
	@ApiField("ex_4")
	private String ex4;

	/**
	 * 扩展字段5
	 */
	@ApiField("ex_5")
	private String ex5;

	/**
	 * 时间戳
	 */
	@ApiField("time_stamp")
	private String timeStamp;

	public String getAccountId() {
		return this.accountId;
	}
	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}

	public String getBizId() {
		return this.bizId;
	}
	public void setBizId(String bizId) {
		this.bizId = bizId;
	}

	public String getCompanyId() {
		return this.companyId;
	}
	public void setCompanyId(String companyId) {
		this.companyId = companyId;
	}

	public String getContentId() {
		return this.contentId;
	}
	public void setContentId(String contentId) {
		this.contentId = contentId;
	}

	public String getEntityData() {
		return this.entityData;
	}
	public void setEntityData(String entityData) {
		this.entityData = entityData;
	}

	public String getEntityDesc() {
		return this.entityDesc;
	}
	public void setEntityDesc(String entityDesc) {
		this.entityDesc = entityDesc;
	}

	public String getEntityHash() {
		return this.entityHash;
	}
	public void setEntityHash(String entityHash) {
		this.entityHash = entityHash;
	}

	public String getEntityType() {
		return this.entityType;
	}
	public void setEntityType(String entityType) {
		this.entityType = entityType;
	}

	public String getEntityUrl() {
		return this.entityUrl;
	}
	public void setEntityUrl(String entityUrl) {
		this.entityUrl = entityUrl;
	}

	public String getEntityVector() {
		return this.entityVector;
	}
	public void setEntityVector(String entityVector) {
		this.entityVector = entityVector;
	}

	public String getEx1() {
		return this.ex1;
	}
	public void setEx1(String ex1) {
		this.ex1 = ex1;
	}

	public String getEx2() {
		return this.ex2;
	}
	public void setEx2(String ex2) {
		this.ex2 = ex2;
	}

	public String getEx3() {
		return this.ex3;
	}
	public void setEx3(String ex3) {
		this.ex3 = ex3;
	}

	public String getEx4() {
		return this.ex4;
	}
	public void setEx4(String ex4) {
		this.ex4 = ex4;
	}

	public String getEx5() {
		return this.ex5;
	}
	public void setEx5(String ex5) {
		this.ex5 = ex5;
	}

	public String getTimeStamp() {
		return this.timeStamp;
	}
	public void setTimeStamp(String timeStamp) {
		this.timeStamp = timeStamp;
	}

}
