package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 商户批量数据反馈
 *
 * @author auto create
 * @since 1.0, 2016-09-13 15:15:04
 */
public class AlipayOpenAppZhimaDataBatchFeedbackModel extends AlipayObject {

	private static final long serialVersionUID = 5559939524489486771L;

	/**
	 * 扩展业务参数
	 */
	@ApiField("biz_ext_params")
	private String bizExtParams;

	/**
	 * 文件列名
	 */
	@ApiField("columns")
	private String columns;

	/**
	 * 文件
	 */
	@ApiField("file")
	private String file;

	/**
	 * 反馈文件的数据编码
	 */
	@ApiField("file_charset")
	private String fileCharset;

	/**
	 * 文件描述信息
	 */
	@ApiField("file_description")
	private String fileDescription;

	/**
	 * 文件类型
	 */
	@ApiField("file_type")
	private String fileType;

	/**
	 * 主键列名
	 */
	@ApiField("primary_key_columns")
	private String primaryKeyColumns;

	/**
	 * 反馈数据条数
	 */
	@ApiField("records")
	private String records;

	/**
	 * 商户应用中录入的数据反馈类型
	 */
	@ApiField("type_id")
	private String typeId;

	public String getBizExtParams() {
		return this.bizExtParams;
	}
	public void setBizExtParams(String bizExtParams) {
		this.bizExtParams = bizExtParams;
	}

	public String getColumns() {
		return this.columns;
	}
	public void setColumns(String columns) {
		this.columns = columns;
	}

	public String getFile() {
		return this.file;
	}
	public void setFile(String file) {
		this.file = file;
	}

	public String getFileCharset() {
		return this.fileCharset;
	}
	public void setFileCharset(String fileCharset) {
		this.fileCharset = fileCharset;
	}

	public String getFileDescription() {
		return this.fileDescription;
	}
	public void setFileDescription(String fileDescription) {
		this.fileDescription = fileDescription;
	}

	public String getFileType() {
		return this.fileType;
	}
	public void setFileType(String fileType) {
		this.fileType = fileType;
	}

	public String getPrimaryKeyColumns() {
		return this.primaryKeyColumns;
	}
	public void setPrimaryKeyColumns(String primaryKeyColumns) {
		this.primaryKeyColumns = primaryKeyColumns;
	}

	public String getRecords() {
		return this.records;
	}
	public void setRecords(String records) {
		this.records = records;
	}

	public String getTypeId() {
		return this.typeId;
	}
	public void setTypeId(String typeId) {
		this.typeId = typeId;
	}

}
