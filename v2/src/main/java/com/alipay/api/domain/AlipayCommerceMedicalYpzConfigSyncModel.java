package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 云陪诊医院扁鹊配置同步
 *
 * @author auto create
 * @since 1.0, 2026-06-23 13:42:55
 */
public class AlipayCommerceMedicalYpzConfigSyncModel extends AlipayObject {

	private static final long serialVersionUID = 5344929444579831843L;

	/**
	 * null
	 */
	@ApiListField("data_list")
	@ApiField("bianque_config_item")
	private List<BianqueConfigItem> dataList;

	public List<BianqueConfigItem> getDataList() {
		return this.dataList;
	}
	public void setDataList(List<BianqueConfigItem> dataList) {
		this.dataList = dataList;
	}

}
