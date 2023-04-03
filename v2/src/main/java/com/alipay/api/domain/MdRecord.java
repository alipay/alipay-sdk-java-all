package com.alipay.api.domain;

import java.util.Date;
import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 记录的model
 *
 * @author auto create
 * @since 1.0, 2021-09-27 20:52:17
 */
public class MdRecord extends AlipayObject {

	private static final long serialVersionUID = 5715442537841263976L;

	/**
	 * 主数据的结构类型
如：网状类型（NETWORK）
	 */
	@ApiField("data_struct")
	private String dataStruct;

	/**
	 * 主数据项名
	 */
	@ApiField("dicode")
	private String dicode;

	/**
	 * 主数据项的中文名称
	 */
	@ApiField("diname")
	private String diname;

	/**
	 * 记录动态字段的键值对
	 */
	@ApiListField("dynamic_fields")
	@ApiField("fv_pair_list")
	private List<FvPairList> dynamicFields;

	/**
	 * 数据条目的更改时间
	 */
	@ApiField("gmt_modified")
	private Date gmtModified;

	/**
	 * 数据条目的id值
	 */
	@ApiField("id")
	private String id;

	/**
	 * 备注信息
	 */
	@ApiField("memo")
	private String memo;

	/**
	 * 父亲节点的id列表，网状结构可能有多个父亲节点
	 */
	@ApiListField("multi_parents")
	@ApiField("string")
	private List<String> multiParents;

	public String getDataStruct() {
		return this.dataStruct;
	}
	public void setDataStruct(String dataStruct) {
		this.dataStruct = dataStruct;
	}

	public String getDicode() {
		return this.dicode;
	}
	public void setDicode(String dicode) {
		this.dicode = dicode;
	}

	public String getDiname() {
		return this.diname;
	}
	public void setDiname(String diname) {
		this.diname = diname;
	}

	public List<FvPairList> getDynamicFields() {
		return this.dynamicFields;
	}
	public void setDynamicFields(List<FvPairList> dynamicFields) {
		this.dynamicFields = dynamicFields;
	}

	public Date getGmtModified() {
		return this.gmtModified;
	}
	public void setGmtModified(Date gmtModified) {
		this.gmtModified = gmtModified;
	}

	public String getId() {
		return this.id;
	}
	public void setId(String id) {
		this.id = id;
	}

	public String getMemo() {
		return this.memo;
	}
	public void setMemo(String memo) {
		this.memo = memo;
	}

	public List<String> getMultiParents() {
		return this.multiParents;
	}
	public void setMultiParents(List<String> multiParents) {
		this.multiParents = multiParents;
	}

}
