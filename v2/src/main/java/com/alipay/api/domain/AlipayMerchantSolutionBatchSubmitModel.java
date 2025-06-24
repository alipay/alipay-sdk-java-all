package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 间连解决方案批次数据提报
 *
 * @author auto create
 * @since 1.0, 2024-06-14 11:01:15
 */
public class AlipayMerchantSolutionBatchSubmitModel extends AlipayObject {

	private static final long serialVersionUID = 7474631343383478994L;

	/**
	 * 解决方案数据提报中，提报的文件信息
	 */
	@ApiListField("file_info")
	@ApiField("alipay_solution_file")
	private List<AlipaySolutionFile> fileInfo;

	/**
	 * 外部批次号，在外部系统中唯一标识一个提报批次
	 */
	@ApiField("out_batch_no")
	private String outBatchNo;

	/**
	 * 解决方案对应的场景code，部分解决方案不区分场景时，可传default
	 */
	@ApiField("scene_code")
	private String sceneCode;

	/**
	 * 标识唯一的解决方案
	 */
	@ApiField("solution_code")
	private String solutionCode;

	public List<AlipaySolutionFile> getFileInfo() {
		return this.fileInfo;
	}
	public void setFileInfo(List<AlipaySolutionFile> fileInfo) {
		this.fileInfo = fileInfo;
	}

	public String getOutBatchNo() {
		return this.outBatchNo;
	}
	public void setOutBatchNo(String outBatchNo) {
		this.outBatchNo = outBatchNo;
	}

	public String getSceneCode() {
		return this.sceneCode;
	}
	public void setSceneCode(String sceneCode) {
		this.sceneCode = sceneCode;
	}

	public String getSolutionCode() {
		return this.solutionCode;
	}
	public void setSolutionCode(String solutionCode) {
		this.solutionCode = solutionCode;
	}

}
