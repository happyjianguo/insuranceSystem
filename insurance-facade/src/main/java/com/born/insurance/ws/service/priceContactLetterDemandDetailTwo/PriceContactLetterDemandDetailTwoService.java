package com.born.insurance.ws.service.priceContactLetterDemandDetailTwo;
import com.born.insurance.ws.result.base.QueryBaseBatchResult;
import com.born.insurance.ws.result.base.InsuranceBaseResult;
import com.born.insurance.ws.info.priceContactLetterDemandDetailTwo.PriceContactLetterDemandDetailTwoInfo;
import com.born.insurance.ws.order.priceContactLetterDemandDetailTwo.PriceContactLetterDemandDetailTwoOrder;
import com.born.insurance.ws.order.priceContactLetterDemandDetailTwo.PriceContactLetterDemandDetailTwoQueryOrder;

public interface PriceContactLetterDemandDetailTwoService  {
	/**
     * 保存(新增/修改)
     *
     * @param order 不能为null
     * @return 成功/失败
     */
    InsuranceBaseResult save(PriceContactLetterDemandDetailTwoOrder order);

    /**
     * 查询信息
     *
     * @param id 单据编号
     * @return 风险预警对象
     */
    PriceContactLetterDemandDetailTwoInfo findById(long id);



    /**
     * 根据条件查询列表
     *
     * @param queryOrder 查询条件
     * @return 结果集
     */
    QueryBaseBatchResult<PriceContactLetterDemandDetailTwoInfo> queryList(PriceContactLetterDemandDetailTwoQueryOrder queryOrder);
	
}	