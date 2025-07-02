package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 机构信号同步
 *
 * @author auto create
 * @since 1.0, 2025-05-23 11:02:43
 */
public class AntfortuneFinresearchInstSignalSyncModel extends AlipayObject {

	private static final long serialVersionUID = 7146166682634921829L;

	/**
	 * valueFactor	String	原始因子值
valueRank	int	行业排名，排名取1-45
valueSig	int	上车信号1-可上车、0-中性、-1-有风险
industryCode	String	行业指数，见“4、行业指数字典”
	 */
	@ApiListField("datas")
	@ApiField("inst_sig_config_info")
	private List<InstSigConfigInfo> datas;

	/**
	 * 蚂蚁财富对于公募基金在财富号后台生成的机构号，可以跟蚂蚁财富对接技术申请获取
	 */
	@ApiField("inst_id")
	private String instId;

	public List<InstSigConfigInfo> getDatas() {
		return this.datas;
	}
	public void setDatas(List<InstSigConfigInfo> datas) {
		this.datas = datas;
	}

	public String getInstId() {
		return this.instId;
	}
	public void setInstId(String instId) {
		this.instId = instId;
	}

}
