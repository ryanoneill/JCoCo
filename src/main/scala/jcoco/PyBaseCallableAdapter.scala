// TODO: Insert License Header
package jcoco

import java.util.{ArrayList => JArrayList}

class PyBaseCallableAdapter extends PyCallable {

  override def __call__(args: JArrayList[PyObject]): PyObject =
    throw new PyException(
      PyException.ExceptionType.PYILLEGALOPERATIONEXCEPTION,
      "Cannot call __call__ on PyCallableAdapter object")

  override def getType: PyType =
    JCoCo.PyTypes.get(PyType.PyTypeId.PyFunctionType)

  override def callMethod(name: String, args: JArrayList[PyObject]): PyObject =
    throw new PyException(
      PyException.ExceptionType.PYILLEGALOPERATIONEXCEPTION,
      "Cannot call __call__ on PyCallableAdapter object")

  override def str: String = "PyBaseCallableAdapter()"

  override def set(key: String, value: PyObject): Unit =
    throw new PyException(
      PyException.ExceptionType.PYILLEGALOPERATIONEXCEPTION,
      "Cannot call set on PyCallableAdapter object")

  override def get(key: String): PyObject =
    throw new PyException(
      PyException.ExceptionType.PYILLEGALOPERATIONEXCEPTION,
      "Cannot call get on PyCallableAdapter object")

  override def hashCode: Int =
    throw new PyException(
      PyException.ExceptionType.PYILLEGALOPERATIONEXCEPTION,
      "Cannot call hashCode on PyCallableAdapter object")

  override def equals(o: Any): Boolean =
    throw new PyException(
      PyException.ExceptionType.PYILLEGALOPERATIONEXCEPTION,
      "Cannot call equals on PyCallableAdapter object")

}
