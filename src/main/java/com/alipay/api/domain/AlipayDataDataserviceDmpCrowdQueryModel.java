package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询dmp人群导出状态
 *
 * @author auto create
 * @since 1.0, 2017-10-16 17:30:07
 */
public class AlipayDataDataserviceDmpCrowdQueryModel extends AlipayObject {

	private static final long serialVersionUID = 4434919675928566471L;

	/**
	 * 人群同步任务id，由alipay.data.dataservice.dmp.crowd.sync接口可取得，用来查询人群同步任务状态
	 */
	@ApiField("dump_id")
	private String dumpId;

	public String getDumpId() {
		return this.dumpId;
	}
	public void setDumpId(String dumpId) {
		this.dumpId = dumpId;
	}

}
