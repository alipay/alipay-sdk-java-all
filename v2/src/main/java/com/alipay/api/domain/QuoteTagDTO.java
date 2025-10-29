package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 行情标签元素模型
 *
 * @author auto create
 * @since 1.0, 2025-10-10 17:22:47
 */
public class QuoteTagDTO extends AlipayObject {

	private static final long serialVersionUID = 1577251539699399134L;

	/**
	 * 拓展信息
	 */
	@ApiField("ext_props")
	private String extProps;

	/**
	 * 标签名称
	 */
	@ApiField("name")
	private String name;

	/**
	 * 标的物id
	 */
	@ApiField("obj_id")
	private String objId;

	/**
	 * 修改时间
	 */
	@ApiField("snapshot_date")
	private Long snapshotDate;

	/**
	 * 标签代码
	 */
	@ApiField("tag_code")
	private String tagCode;

	public String getExtProps() {
		return this.extProps;
	}
	public void setExtProps(String extProps) {
		this.extProps = extProps;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getObjId() {
		return this.objId;
	}
	public void setObjId(String objId) {
		this.objId = objId;
	}

	public Long getSnapshotDate() {
		return this.snapshotDate;
	}
	public void setSnapshotDate(Long snapshotDate) {
		this.snapshotDate = snapshotDate;
	}

	public String getTagCode() {
		return this.tagCode;
	}
	public void setTagCode(String tagCode) {
		this.tagCode = tagCode;
	}

}
