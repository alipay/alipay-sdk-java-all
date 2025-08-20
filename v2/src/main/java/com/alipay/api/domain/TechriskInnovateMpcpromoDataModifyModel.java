package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 小程序云智能应用数据源更新接口
 *
 * @author auto create
 * @since 1.0, 2023-08-15 11:09:12
 */
public class TechriskInnovateMpcpromoDataModifyModel extends AlipayObject {

	private static final long serialVersionUID = 5844548988968463237L;

	/**
	 * 需要新增的数据，结构为二维数组。
如：[["艾尼","是"],["拉克","否"]]
	 */
	@ApiListField("add_data_list")
	@ApiField("column_data")
	private List<ColumnData> addDataList;

	/**
	 * 需要删除的数据，结构为二维数组。 
如：[["简妮","否"],["拉瑞","是"]]
	 */
	@ApiListField("del_data_list")
	@ApiField("column_data")
	private List<ColumnData> delDataList;

	/**
	 * 商户之前导入的文件名称。
	 */
	@ApiField("filename")
	private String filename;

	/**
	 * 列名列表
	 */
	@ApiListField("row_info_list")
	@ApiField("string")
	private List<String> rowInfoList;

	public List<ColumnData> getAddDataList() {
		return this.addDataList;
	}
	public void setAddDataList(List<ColumnData> addDataList) {
		this.addDataList = addDataList;
	}

	public List<ColumnData> getDelDataList() {
		return this.delDataList;
	}
	public void setDelDataList(List<ColumnData> delDataList) {
		this.delDataList = delDataList;
	}

	public String getFilename() {
		return this.filename;
	}
	public void setFilename(String filename) {
		this.filename = filename;
	}

	public List<String> getRowInfoList() {
		return this.rowInfoList;
	}
	public void setRowInfoList(List<String> rowInfoList) {
		this.rowInfoList = rowInfoList;
	}

}
