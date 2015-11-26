package by.es.loader;

/**
 * User: Alexey.Koyro
 */
public class LibraryLoader extends ClassLoader
{
    public LibraryLoader(ClassLoader parent)
    {
        super(parent);
    }

    @Override
    protected Class<?> loadClass(String name, boolean resolve) throws ClassNotFoundException
    {
        return super.loadClass(name, resolve);
    }

    @Override
    protected Class<?> findClass(String name) throws ClassNotFoundException {
        return super.findClass(name);
    }
}
