fun main()
{
    // break: stops the whole loop
    // continue : stops the current iteration
    for(i in 1..10)
    {
        if(i % 3 == 0)
            continue
        println(i)
    }
    // note: this can be solved as below
    for(i in 1..10)
    {
        if(i % 3 != 0)
            println(i)
    }

    for (i in 1..20)        // External loop
    {
        for(j in 1..20)     // Internal loop
        {
            if(j == 2 * i)
                break
        // break in this case will stop the internal (enclosing) loop,
        // if you need to stop the external loop then you need to use labels
        }
    }

    // using label
    outerLoop@ for (i in 1..20)        // External loop
    {
        for(j in 1..20)     // Internal loop
        {
            if(j == 2 * i)
                break@outerLoop
            // break in this case will stop the external loop,
        }
    }
}