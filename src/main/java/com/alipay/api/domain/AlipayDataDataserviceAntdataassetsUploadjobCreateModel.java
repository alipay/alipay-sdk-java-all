package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 创建上云任务
 *
 * @author auto create
 * @since 1.0, 2019-04-30 15:12:26
 */
public class AlipayDataDataserviceAntdataassetsUploadjobCreateModel extends AlipayObject {

	private static final long serialVersionUID = 4876779748551344359L;

	/**
	 * ODPS表的guid
	 */
	@ApiField("guid")
	private String guid;

	/**
	 * ODPS表的字段元信息，包括字段名和字段类型
	 */
	@ApiListField("odps_columns")
	@ApiField("antdataassets_odps_column")
	private List<AntdataassetsOdpsColumn> odpsColumns;

	public String getGuid() {
		return this.guid;
	}
	public void setGuid(String guid) {
		this.guid = guid;
	}

	public List<AntdataassetsOdpsColumn> getOdpsColumns() {
		return this.odpsColumns;
	}
	public void setOdpsColumns(List<AntdataassetsOdpsColumn> odpsColumns) {
		this.odpsColumns = odpsColumns;
	}

}
