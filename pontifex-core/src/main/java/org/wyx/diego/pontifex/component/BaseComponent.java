package org.wyx.diego.pontifex.component;


import org.wyx.diego.pontifex.Component;
import org.wyx.diego.pontifex.exception.BusinessException;
import org.wyx.diego.pontifex.exception.PontifexRuntimeException;

/**
 * @author diego
 * @time 2015-10-25
 * @description
 */
public abstract class BaseComponent<P extends BaseComponentReq, R> implements Component<P, R> {

    protected static void throwException(BusinessException businessException) {
        throw PontifexRuntimeException.exception(businessException);
    }

}
