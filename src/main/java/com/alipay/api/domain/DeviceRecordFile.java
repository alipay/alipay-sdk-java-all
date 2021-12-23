package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 设备档案文件
 *
 * @author auto create
 * @since 1.0, 2021-08-04 10:30:32
 */
public class DeviceRecordFile extends AlipayObject {

	private static final long serialVersionUID = 7656597166357357151L;

	/**
	 * 1.直联商户三绑定必传：
RECORDS_TYPE_PID(直连pid)、
RECORDS_TYPE_SHOPID(shopid);
2.间联商户三绑定必传：
RECORDS_TYPE_SMID（间连smid）、
RECORDS_TYPE_PID(直连pid)、
RECORDS_TYPE_SHOPID(shopid);
3.极简绑定必传：
RECORDS_TYPE_SMID（间连smid）
4.极简绑定升级三绑定必传：
RECORDS_TYPE_SMID（间连smid）、
RECORDS_TYPE_PID(直连pid)、
RECORDS_TYPE_SHOPID(shopid);
	 */
	@ApiField("records_type")
	private String recordsType;

	/**
	 * 与records_type对应的参数值。
如直连商户pid：2088101156429885
	 */
	@ApiField("records_value")
	private String recordsValue;

	public String getRecordsType() {
		return this.recordsType;
	}
	public void setRecordsType(String recordsType) {
		this.recordsType = recordsType;
	}

	public String getRecordsValue() {
		return this.recordsValue;
	}
	public void setRecordsValue(String recordsValue) {
		this.recordsValue = recordsValue;
	}

}
