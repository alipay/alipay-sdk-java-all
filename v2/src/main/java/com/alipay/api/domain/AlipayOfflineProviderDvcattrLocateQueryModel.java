package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * N设备辅助室内定位数据查询
 *
 * @author auto create
 * @since 1.0, 2025-08-19 14:38:47
 */
public class AlipayOfflineProviderDvcattrLocateQueryModel extends AlipayObject {

	private static final long serialVersionUID = 1374672166432569639L;

	/**
	 * 设备点位蓝牙mac地址列表，如果不填则分页查询全量数据
	 */
	@ApiListField("bluetooth_mac")
	@ApiField("string")
	private List<String> bluetoothMac;

	/**
	 * 分页的页数，表示第几页，从1开始
	 */
	@ApiField("page_index")
	private Long pageIndex;

	/**
	 * 分页大小，根据处理情况，选择合适的分页数量
	 */
	@ApiField("page_size")
	private Long pageSize;

	public List<String> getBluetoothMac() {
		return this.bluetoothMac;
	}
	public void setBluetoothMac(List<String> bluetoothMac) {
		this.bluetoothMac = bluetoothMac;
	}

	public Long getPageIndex() {
		return this.pageIndex;
	}
	public void setPageIndex(Long pageIndex) {
		this.pageIndex = pageIndex;
	}

	public Long getPageSize() {
		return this.pageSize;
	}
	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}

}
